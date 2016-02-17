package com.zero.collection

object TupleTest {
    def main(args: Array[String]): Unit = {
        test1();
    }

    def test1() {
        val tuple1 = (123, "String");
        println(tuple1._1) //123
        println(tuple1._2) //String

        val tuple2 = (1, 3, "String")
        val f = tuple2._1
        val (s, t) = (tuple2._1, tuple2._3)
        val (_, _, a) = tuple2
        println(s) //1
        println(a) //String
    }
}