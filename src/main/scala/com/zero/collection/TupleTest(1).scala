package com.zero.collection

/**
  * Created by jianjia1 on 2016/1/29.
  */
object TupleTest {
    def main(args: Array[String]) {
        val triple = (100, "Scala", "Spark")
        println(triple._1)
        println(triple._2)
        println(triple._3)
    }
}
