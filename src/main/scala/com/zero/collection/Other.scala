package com.zero.collection

/**
  * Created by jianjia1 on 2016/2/28.
  */
object Other {
    val scores = scala.collection.mutable.Map("Hadoop" -> 8, "Spark" -> 10)
    val hadoopScore = scores.getOrElse("Hadoop", 0)
    println(hadoopScore)
    scores += ("Scala" -> 9)
    scores -= "Hadoop"
    for ((k, v) <- scores) {
        println("Key is " + k + ", value is " + v)
    }

    val sortedScore = scala.collection.immutable.SortedMap("Hadoop" -> 8, "Spark" -> 10)

    val tuple = (1, 2, 3.14, "Rocky", "Spark")
    val third = tuple._3
    val (first, second, thirda, fourth, fifth) = tuple
    val (f, s, _, _, _) = tuple

    "Rocky Spark".partition(_.isUpper)

    val symbols = Array("[", "*", "]")
    val counts = Array(2, 5, 2)
    val pairs = symbols.zip(counts)
    for ((x, y) <- pairs) print(x * y)
}
