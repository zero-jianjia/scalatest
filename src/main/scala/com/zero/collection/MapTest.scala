package com.zero.collection

import scala.collection.mutable

/**
  * Created by jianjia1 on 2016/1/29.
  */
object MapTest {
    def main(args: Array[String]) {
        //        test1()
        //        test2()
        test3()
    }

    //其它操作
    def test3(): Unit = {
        val map1 = Map("book" -> 10, "yun" -> 18, "ipad" -> 1000)
        val map2 = for ((k, v) <- map1) yield (k, v * 0.9)
        for ((k, v) <- map2) {
            println("Key is " + k + ", value is " + v)
        }


    }

    //更新Map,必须是mutable.Map
    def test2(): Unit = {
        val map = mutable.Map("Rocky" -> 27, "Spark" -> 5)
        map("Spark") = 15 //更新key
        map("Hadoop") = 5 //增加key
        println(map) //Map(Rocky -> 27, Hadoop -> 5, Spark -> 15)

        map +=("Kafka" -> 7, "Strom" -> 9)
        map -= "Rocky"
        println(map) //Map(Strom -> 9, Kafka -> 7, Hadoop -> 5, Spark -> 15)

        //无法更新immutable.Map，但是可以这样
        val map2 = Map("Rocky" -> 27, "Spark" -> 5) + ("Spark" -> 7)
        println(map2) //Map(Rocky -> 27, Spark -> 7), 注意 Spark 的值
        println(Map("Rocky" -> 27, "Spark" -> 5) - "Rocky") //Map(Spark -> 5)
    }


    def test1(): Unit = {
        //构建Map，immutable.Map
        val ages = Map("Rocky" -> 27, "Spark" -> 5)
        val age2 = Map(("Rocky", 27), ("Spark", 5))

        //遍历
        for ((k, v) <- ages) println("Key is " + k + ", value is " + v)
        for ((k, _) <- ages) println("Key is " + k)

        println(ages.keys) //Iterable, Set(Rocky, Spark) ,本质上还是调用了keySet
        println(ages.keySet) //immutable.Set, Set(Rocky, Spark)
        println(ages.values) //Iterable, MapLike(27, 5)

        //值 获取
        ages.get("Spark") //Option[Int]//返回值是Option
        //获取真正的值
        val value = ages.get("Spark").get
        println(value) //5

        //如果key不存在，这使用get会出异常，需要这样
        val value1 = ages.get("Hadoop").getOrElse("-1")
        println(value1) //-1
    }

}
