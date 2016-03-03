package org.zero.twitter_future

import java.util.concurrent.TimeUnit

import com.twitter.util.Future._
import com.twitter.util.{Await, Future}

/**
  * Created by Inuyasha on 03.03.
  */
object FutureTest {
    def main(args: Array[String]) {
        //        test1
        test2
    }


    def test2: Unit = {
        val future3 = Future.join(getFuture1, getFuture2)
        val f = future3 flatMap { e =>
            Future.value(e._1 + e._2)
        }
        println(Await.result(f))
    }

    //组合两个future的结果为另一个future
    def test1: Unit = {
        val future3 = for (f1 <- getFuture1; f2 <- getFuture2) yield (f1 + " " + f2)
        println("await")
        val result = Await.result(future3, DEFAULT_TIMEOUT)
        println(result)

        //运行结果
        //        begin future1
        //        future1 over.
        //        begin future2
        //        future2 over.
        //        await
        //        hello zero
    }


    def getFuture1 = {
        println("begin future1")
        TimeUnit.SECONDS.sleep(1)
        println("future1 over.")
        Future.value("hello")
    }

    def getFuture2 = {
        println("begin future2")
        TimeUnit.SECONDS.sleep(3)
        println("future2 over.")
        Future.value("zero")
    }

}
