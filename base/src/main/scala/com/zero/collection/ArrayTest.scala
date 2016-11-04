package com.zero.collection

/**
  * Created by jianjia1 on 2016/1/29.
  */
object ArrayTest {
    def main(args: Array[String]) {
        //        test1()
        //        test2()
        test3()
    }

    def test4(): Unit = {
        val a = Array(1,2)
        val b = Array(3,4)
        val c = a ++ b

        val e = List(1,2)
        val d = scala.collection.mutable.LinkedList(3,4)
        val f = e ++: d //右边操纵数的类型决定着返回结果的类型
        println(f.getClass().getName())// f的类型是：scala.collection.mutable.LinkedList

        val aa = List(1,2)
        val cc = 0 +: aa // cc中的内容是 （0,1,2）, :+
    }

    def test3(): Unit = {
        //数组转换Map
        val keys = Array("a", "b", "c", "d")
        val tuple2 = keys.map(key => (key, key.hashCode))
        println(tuple2.mkString("; ")) //(a,97); (b,98); (c,99); (d,100)

        val map = keys.map(key => (key, key.hashCode)).toMap
        println(map) //Map(a -> 97, b -> 98, c -> 99, d -> 100)

        val map1 = keys.map (key => (key, key.hashCode)).toMap
        println(map1)
    }

    def test2(): Unit = {
        //数组转换数组
        val a = Array(1, 3, 5)
        val result001 = for (elem <- a) yield 2 * elem
        println(result001.mkString(",")) //2,6,10

        //开启过滤
        val result002 = for (elem <- a if elem < 5) yield 2 * elem
        println(result002.mkString(",")) //2,6

        //第二种方式
        val result003 = a.filter(_ < 5).map(_ * 2)
        println(result003.mkString(",")) //2,6
        val result004 = a.filter {
                (_ < 5)
            } map {
                (_ * 2)
            }
        //或则： a.filter { _ < 5 } map { _ * 2 }
        println(result004.mkString("[", ",", "]")) //[2,6]
    }


    def test1(): Unit = {
        val strArray = new Array[String](2) //长度为2的 String[]
        strArray(0) = "hello"
        strArray(1) = "zero"
        val strArray002 = Array("Hello", "zero")
        strArray002(1) = "world"//可以修改值
        println(strArray.mkString(", ")) //hello, zero
        println(strArray002.mkString(" ")) //Hello zero

        val strArr = Array("hello", "zero");
        for (item <- strArr) {
            print(item + " ") //hello zero
        }
        println
    }
}
