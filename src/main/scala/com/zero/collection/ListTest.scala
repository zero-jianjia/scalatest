package com.zero.collection

import scala.collection.mutable.MutableList

object ListTest {
    def main(args: Array[String]): Unit = {
        test1()
    }

    def test1() {
        val one = List(1, 2)
        val two = List(3, 4)
        val three = one ::: two //连接操作,two.:::(one)
        println(three) //List(1, 2, 3, 4)

        val four = 5 :: three //three.::(5)
        println(four) //(5, 1, 2, 3, 4)

        val five = four.+:(6)
        println(four) //(5, 1, 2, 3, 4)
        println(five) //(6, 5, 1, 2, 3, 4)

        val six = four ::: five ::: Nil //Nil是空列表List()的简写
        println(six) //(5, 1, 2, 3, 4, 6, 5, 1, 2, 3, 4)

        val seven = MutableList(1, 2, 3);
        seven.+:(4)
        println(seven) 
    }
}