package com.zero.base

/**
  * Created by jianjia1 on 2016/1/29.
  */
object FunctionOps {
    def main(args: Array[String]) {
        var increase = (x: Int) => x + 1
        println(increase(10))
        increase = (x: Int) => x + 9999

        val someNumbers = List(-11, -10, -5, 0, 5, 10)
        someNumbers.foreach((x: Int) => print(x))
        println
        someNumbers.filter((x: Int) => x > 0).foreach((x: Int) => print(x))
        println
        someNumbers.filter((x) => x > 0).foreach((x: Int) => print(x))
        println
        someNumbers.filter(x => x > 0).foreach((x: Int) => print(x))
        println
        someNumbers.filter(_ > 0).foreach((x: Int) => print(x))
        println
        val f = (_: Int) + (_: Int)
        println(f(5, 10))
    }
}
