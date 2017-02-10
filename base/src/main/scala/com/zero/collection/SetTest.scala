package com.zero.collection

import scala.collection.immutable.TreeMap
import scala.collection.mutable

/**
  * Created by jianjia1 on 2016/1/29.
  */
object SetTest {
    def main(args: Array[String]) {
        val data = mutable.Set.empty[Int]
        data ++= List(1, 2, 3)
        data += 4;
        data --= List(2, 3);
        println(data)
        data += 1;
        println(data)
        data.clear
        println(data)

        val map = mutable.Map.empty[String, String]
        map("Java") = "Hadoop"
        map("Scala") = "Spark"
        println(map)
        println(map("Scala"))

        val treeSet = mutable.TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)
        println(treeSet)
        val treeSetForChar = mutable.TreeSet("Spark", "Scala", "Hadoop")
        println(treeSetForChar)

        var treeMap = TreeMap("Scala" -> "Spark", "Java" -> "Hadoop")
        println(treeMap)
    }

    def a: Unit ={
        val setA = Set(1,2,3,4)
        val setB = Set(3,4,5)
        val setC = setA &~ setB
        println(setC.toList.mkString(","))

//        val setC = setA ++ setB
//        val setC = setA & setB
//        println(setC.subsets(2).toList.mkString("\n"))
    }
}
