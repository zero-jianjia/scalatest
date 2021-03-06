package org.zero.twitter_future

import java.util.concurrent.{Executors, TimeUnit}
import com.twitter.util.Future._
import com.twitter.util._

/**
  * Created by Inuyasha on 03.03.
  */
object FutureTest {
    def main(args: Array[String]) {
        //        test1
        //        test2
        //        test3
        //        test4
        //        test5
        //        test6
//        test7
//        test8
        test9
    }
    
    def test9: Unit = {
        val f1 = Future({
            println(Thread.currentThread().getName)
            Thread.sleep(1000)
        })
        val f2 = Future({
            println(Thread.currentThread().getName)
            Thread.sleep(1000)
        })
        
    }
    
    def test8: Unit = {
        val executors = Executors.newFixedThreadPool(5)
        val futurePool: ExecutorServiceFuturePool = FuturePool.apply(executors)
        
        val f1 = futurePool.apply({
            Thread.currentThread().setName("pool-thread-a")
            println("f1 -- " + Thread.currentThread().getName)//f1 -- pool-thread-a,池线程
            "zero"
        })
        
        TimeUnit.SECONDS.sleep(1)
        val f2 = f1.flatMap(s => Future.value({
            println("f2 -- " + Thread.currentThread().getName)//不定！
            "zero"
        }))
        
        val f3 = Future.value({ //会等待结果产生
            println("f3 -- " + Thread.currentThread().getName)//f3 -- main,主线程
            TimeUnit.SECONDS.sleep(3)
            "zero"
        })
        println("----")
        
        val f4 = futurePool.apply({
            TimeUnit.SECONDS.sleep(1)
            println("f4 -- " + Thread.currentThread().getName)//f4 -- pool-1-thread-2,池线程 
            "zero"
        })
        
        val f5 = Future.join(f1, f4).flatMap { case (a, b) => {
            println("f5 -- " + Thread.currentThread().getName)//不定！main或池线程，加上sleep后均是池线程，不知道为啥？下同
            TimeUnit.SECONDS.sleep(3)
            Future.Nil
        }
        }
        
        val f7 = Future.join(f1, f2).flatMap { case (a, b) => Future.value {
            TimeUnit.SECONDS.sleep(1)
            println("f7 -- " + Thread.currentThread().getName)//f7 -- main
        }
        }
        val f6 = f1.join(f5).flatMap({
            case (a, b) => {
                println("f6 -- " + Thread.currentThread().getName)//f6 -- pool-1-thread-2
                Future.Nil
            }
        })
        println("end")
        Await.all(f1, f2, f3, f4, f5, f6)
        // 鉴于多种情况下的测试，发现这样的结论;
        // 当主线程执行 a.join(b)、Future.join(a, b) 时，如果a或b已经运行完成，那么由主线程运行flatMap中代码，否则由a或b中的线程执行flatMap中代码
        // 同样，对于 a.flatMap ,也是如此
    }
    
    def test7: Unit = {
        val executors = Executors.newFixedThreadPool(3)
        val futurePool: ExecutorServiceFuturePool = FuturePool.apply(executors)
        
        val f1 = futurePool.apply({
            println("1 -- " + Thread.currentThread().getName)//1 -- pool-1-thread-1
            "zero"
        })
        val f2 = f1.flatMap(s => {
            println("2 -- " + Thread.currentThread().getName)//2 -- pool-1-thread-1
            futurePool.apply({
                println("3 -- " + Thread.currentThread().getName)//3 -- pool-1-thread-2
                s.length
            })
        })
        val f3 = f1.flatMap(s => {
            println("4 -- " + Thread.currentThread().getName)//4 -- pool-1-thread-1
            Future.value({
                println("5 -- " + Thread.currentThread().getName)//5 -- pool-1-thread-1
            })
        })
        f1.join(Future.Void).flatMap({ case (a, b) => {
            println("6 -- " + Thread.currentThread().getName)//6 -- main
            Future.value({
                println("7 -- " + Thread.currentThread().getName)//7 -- main
            })
        }
        })
        
        Await.result(f2)
        Await.result(f3)
    }
    
    def test6: Unit = {
        //        fail("", "")
        //        println(111111)
        println(Await.result(fail("", "").within(new JavaTimer(true, Option.apply("timer")), Duration
            .fromMilliseconds(1))))
    }
    
    def test5: Unit = {
        val f = getFuture3
        println("---await---")
        val a = Await.ready(f)
        println("a = " + a) //a = Promise@1798286609(state=Done(Return(zero)))
        println(Await.result(f)) //zero
        println("--------111")
        println(Await.all(getFuture2)) //等待future完成
        println("--------222")
    }
    
    //抛出异常并被捕获
    def test4: Unit = {
        println("----------")
        val result = Future.join(getFuture1, getFuture2 /*fail("a", "b")*/).flatMap {
            case (result1, result2) => combine(result1, result2)
        }.within(new JavaTimer(true, Option.apply("timer")), Duration.fromSeconds(3)) //超时等待
            .ensure {
            //Ensure is executed both in case of succes or failure.
            println("---ensure----")
        }.rescue {
            //Only execute when exception occurred
            case e: Exception => {
                println(e.getMessage + " " + e.getClass) //3.seconds class com.twitter.util.TimeoutException
                Future.False
            }
        } /*.delayed(Duration.fromSeconds(7))(new JavaTimer(true, Option.apply("timer")))*/
        //延迟多长时间运行
        println("await")
        println(Await.result(result))
        println("overoverover")
    }
    
    def test3: Unit = {
        val future3 = Future.join(getFuture1, getFuture2)
        val f = future3 flatMap { e =>
            combine(e._1, e._2)
        }
        println("await")
        println(Await.result(f))
        //运行结果。Future.join比for要好，真正的异步并发
        //        begin future1
        //        future1 --- UnboundedFuturePool-1
        //        begin future2
        //        future2 --- pool-1-thread-1
        //        await
        //        future1 over.
        //        future2 over.
        //        combine zero + zero
        //        zero-zero
    }
    
    def test2: Unit = {
        val result =
            for (
                result1 <- getFuture1;
                result2 <- getFuture2;
                combineResult <- combine(result1, result2)
            ) yield combineResult
        
        println("await")
        val v = Await.result(result)
        println(v)
        //        begin future1
        //        future1 --- UnboundedFuturePool-1
        //        await
        //        future1 over.
        //        begin future2
        //        future2 --- pool-1-thread-1
        //        future2 over.
        //        combine zero + zero
        //        zero-zero
    }
    
    //组合两个future的结果为另一个future,test2也是同样
    def test1: Unit = {
        val future3 = for (f1 <- getFuture1; f2 <- getFuture2) yield (f1 + " " + f2)
        println("await")
        val result = Await.result(future3, DEFAULT_TIMEOUT)
        println(result)
        //运行结果,效果上看for中内容还是串行执行，但 future3 与 println("await") 是并行
        //        begin future1
        //        await
        //        future1 --- UnboundedFuturePool-1
        //        future1 over.
        //        begin future2
        //        future2 --- pool-1-thread-1
        //        future2 over.
        //        zero zero
    }
    
    def combine(a: String, b: String): Future[String] = {
        FuturePool.unboundedPool {
            println(s"combine $a + $b")
            TimeUnit.SECONDS.sleep(1)
            a + "-" + b
        }
    }
    
    def fail(a: String, b: String): Future[String] = {
        FuturePool.unboundedPool {
            println("fail operation.")
            TimeUnit.SECONDS.sleep(1)
            println("throwing exception!")
            throw new Exception("Exception.")
        }
    }
    
    def getFuture1: Future[String] = {
        FuturePool.unboundedPool {
            //使用的是UnboundedFuturePool（无界）
            println("begin future1")
            println("future1 --- " + Thread.currentThread().getName)
            TimeUnit.SECONDS.sleep(3)
            println("future1 over.")
            "zero"
        }
    }
    
    def getFuture2: Future[String] = {
        val executors = Executors.newFixedThreadPool(3)
        val futurePool: ExecutorServiceFuturePool = FuturePool.apply(executors)
        futurePool.apply({
            //使用的是自定义的pool
            println("begin future2")
            println("future2 --- " + Thread.currentThread().getName)
            TimeUnit.SECONDS.sleep(5)
            println("future2 over.")
            "zero"
        })
    }
    
    def getFuture3: Future[String] = {
        FuturePool.unboundedPool {
            println("begin future3")
            println(Thread.currentThread().getName)
            TimeUnit.SECONDS.sleep(3)
            println("future3 over.")
            "zero"
        }
    }
}
