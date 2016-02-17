package com.zero.collection

object ArrayTest {
    def main(args: Array[String]): Unit = {
        test1()
    }

    def test1() {
        var strArray = new Array[String](2)
        strArray(0) = "hello"
        strArray(1) = "zero"
        strArray(1) = "zeroaf"

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