package com.zero.collection

import scala.collection.mutable.Set
import scala.collection.mutable.HashSet
import scala.collection.mutable.Map

object SetTest {
    def main(args: Array[String]): Unit = {
        //        test1()
        //        test2()
        //        test3()
        test4()
    }

    def test4() {
val map1 = Map("a" -> 3)
val map2 = for ((k, v) <- map1) yield (k, v + 3)
println(map2) //Map(a -> 6)

val map3 = scala.collection.mutable.Map("a" -> 3)
println(map3.getOrElse("a", 4)) //3
println(map3.getOrElse("aa", 4)) //4
map3 += ("b" -> 5)
map3 -= "a"
println(map3) //Map(b -> 5)
    }

    def test3() {
        val mutableMap = Map[String, String]()
        mutableMap += ("a" -> "zero")
        mutableMap.+=("b" -> "one")
        println(mutableMap) //Map(b -> one, a -> zero)

        val map = Map("a" -> "zero", "b" -> "one")
        println(map("b")) //one

        for ((k, v) <- map)
            println("key = " + k + ", value = " + v)

        for ((k, _) <- map) { //占位符
            println("key = " + k)
        }

    }

    def test1() {
        val set1 = Set("zero", "one")
        set1 + "two"
        println(set1) //Set(zero, one)
        set1 += "two"
        println(set1) //Set(zero, two, one)
    }

    def test2() {
        var set1 = HashSet("zero", "one")
    }

}