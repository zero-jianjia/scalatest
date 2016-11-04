package com.zero.collection

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jianjia1 on 2016/1/29.
  */
object ArrayBufferTest {
    def main(args: Array[String]) {
        val b = ArrayBuffer[Int]() //变长数组，或则 new ArrayBuffer[Int]
        b += 1 //ArrayBuffer(1), += 是在尾端添加
        b +=(1, 2, 3, 5) //ArrayBuffer(1, 1, 2, 3, 5)
        b ++= Array(8, 13, 21) //++= 追加集合，ArrayBuffer(1, 1, 2, 3, 5, 8, 13, 21)
        b.trimEnd(5) //移除最后5个元素，ArrayBuffer(1, 1, 2)
        println(b) //ArrayBuffer(1, 1, 2)

        b.insert(2, 6) //在下标2位置插入 6
        b.insert(2, 7, 8, 9) //在下标2位置插入 7, 8, 9
        println(b) //ArrayBuffer(1, 1, 7, 8, 9, 6, 2)

        b.remove(2) //移除下标2位置的元素
        println(b) //ArrayBuffer(1, 1, 8, 9, 6, 2)
        b.remove(2, 3) //从下标2位置的元素开始移除3个元素
        println(b) //ArrayBuffer(1, 1, 2)

        for (item <- b) {
            //遍历，方式一
            print(item + " ") //1 1 2
        }
        for (i <- 0 until b.size) {
            //遍历，方式二
            print(b(i) + " ") //1 1 2
        }
        println()

        println(0 until(10, 2)) //Range(0, 2, 4, 6, 8)
        println((0 until (5)).reverse) //Range(4, 3, 2, 1, 0)

        val c = Array(2, 3, 5, 7, 11)
        val result1 = c.map(2 * _)
        for (item <- result1) {
            print(item + " ")
        }
        println()

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
