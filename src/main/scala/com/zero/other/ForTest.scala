package com.zero.other

import java.util.Arrays

object ForTest {
    def main(args: Array[String]): Unit = {
        //        test1()
        //        test2()
        //        test3()
        test4()
    }

    def test4() {
val c = Array(2, 4, 5)
val result = for (elem <- c) yield elem * 2
println(Arrays.toString(result)) //[4, 8, 10]
    }

    def test3() {
        for (i <- 0 to 2; j <- 1 to 3 if i != j) {
            print(i * 10 + j)
            print(" ")
        }
        //1 2 3 12 13 21 23 
    }

    def test2() {
        var arr = Array("001a", "001b", "002a")
        for (a <- arr if !a.endsWith("b"); if a.startsWith("001")) {
            print(a + " ")
        }
    }

    def test1() {
        var arr = Array("001a", "002b", "002a")
        for (a <- arr) {
            print(a + " ")
        }
        println()
        for (i <- 0 to arr.length - 1) {
            print(arr(i) + " ")
        }
        println()
        for (i <- 0 until arr.length) {
            print(arr(i) + " ")
        }
    }
}