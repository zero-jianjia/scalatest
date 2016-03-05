package com.zero.base

/**
  */
object LazyTest {
    def main(args: Array[String]) {


        lazy val a = {
            println("lazy a")
            4 + 7
        }
        val b = {
            println("not lazy b")
            4 + 8
        }
        println("----------")
        println(a)
        println(b)
    }
}

