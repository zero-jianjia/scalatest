package com.zero.collection

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jianjia1 on 2016/1/29.
  */
object ArrayBufferTest {
    def main(args: Array[String]) {
        val b = ArrayBuffer[Int]()
        b += 1
        b +=(1, 2, 3, 5)
        b ++= Array(8, 13, 21)
        b.trimEnd(5)
        b.insert(2, 6)
        b.insert(2, 7, 8, 9)
        b.remove(2)
        b.remove(2, 3)
        for (item <- b) {
            print(item + " ")
        }

        println()
        val c = Array(2, 3, 5, 7, 11)
        val result = for (elem <- c) yield 2 * elem
        for (item <- result) {
            print(item + " ")
        }
        println()

        val result1 = c.map(2 * _)
        for (item <- result1) {
            print(item + " ")
        }

        println()
        for (elem <- c if elem % 2 == 0) yield 2 * elem
        c.filter(_ % 2 == 0).map(2 * _)
        println(c)
        println(c)

        Array(1, 7, 2, 9).sum
        ArrayBuffer("Mary", "had", "a", "little", "lamb").max

        val d = ArrayBuffer(1, 7, 2, 9)
        val bSorted = d.sorted

        val e = Array(1, 7, 2, 9)
        scala.util.Sorting.quickSort(e)
        for (item <- e) {
            print(item + " ")
        }

        println()

        println(e.mkString(" and "))

        println(d.mkString("<", ",", ">"))


        val matrix = Array.ofDim[Double](3, 4)
        matrix(2)(1) = 42
        val triangle = new Array[Array[Int]](10)
        for (i <- 0 until triangle.length)
            triangle(i) = new Array[Int](i + 1)
    }


}
