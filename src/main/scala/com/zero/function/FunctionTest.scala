package com.zero.function

/**
  * Created by jianjia1 on 16/09/20.
  */
object FunctionTest {
    def main(args: Array[String]) {

    }

    def test1: Unit = {
        val funs = new Function1[Int, Int] {
            def apply(x: Int) = {
                x + 1
            }
        }

        //使用
        println(funs.apply(5)) // 6
    }

    def test2: Unit = {
        val funs = new Function1[Int, Int] {
            def apply(x: Int) = {
                println("第一步:" + x)
                x + 1
            }
        }
        val succ = (x: Int) => {
            println("第二步:" + x)
            x + 3
        }
        println(succ.andThen(funs).apply(5))//当前这个方法先执行，执行完的结果作为另一个方法的入参
        /**
          * 第二步:5
          * 第一步:8
          */

        //依然执行这个打印过程
        println(succ.compose(funs).apply(5))//与andThen相反，同样是组合成新的Function1，但是作为参数的那个Function1先执行
        /**
          * 第一步:5
          * 第二步:6
          */
    }

    def test3: Unit = {
        val funs = new Function2[Int,Int,Int] {
            def apply(x:Int,y:Int) = {
                x + y
            }
        }
        println(funs.apply(1,2))    //  3
    }

    def test4: Unit ={
        val funs = new Function2[Int,Int,Int] {
            def apply(x:Int,y:Int) = {
                x + y
            }
        }
        val curryfun = funs.curried
        println(curryfun(1)(2))     //  3
    }

    def test5: Unit ={
        val funs = new Function2[Int,Int,Int] {
            def apply(x:Int,y:Int) = {
                x + y
            }
        }
        val tupledfun = funs.tupled
        println(tupledfun((1,2)))
    }

}
