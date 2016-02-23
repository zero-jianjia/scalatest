package com.zero.collection

/**
  * Created by jianjia1 on 2016/1/29.
  */
object ArrayTest {
    def main(args: Array[String]) {
        test1()
    }

    def test1(): Unit = {
        val strArray = new Array[String](2)
        strArray(0) = "hello"
        strArray(1) = "zero"
        strArray(1) = "zero"

        println(0 to 5) //Range(0, 1, 2, 3, 4, 5)
        println(0 until 5) //Range(0, 1, 2, 3, 4)
        for (i <- 0 to strArray.length - 1) {
            println(strArray(i))
        }

        for (i <- 0 until strArray.length) {
            println(strArray(i))
        }

        val strArr = Array("hello", "zero");

        for (item <- strArr) {
            print(item + " ")
        }
        println
    }
}
