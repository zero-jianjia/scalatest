package com.zero.collection

/**
  * Created by jianjia1 on 2016/1/29.
  */
object MapTest {
    def main(args: Array[String]) {
        val ages = Map("Rocky" -> 27, "Spark" -> 5)

        for ((k, v) <- ages) {
            println("Key is " + k + ", value is " + v)
        }

        for ((k, _) <- ages) {
            println("Key is " + k)
        }

        val map = Map("book" -> 10, "yun" -> 18, "ipad" -> 1000)
        val map2 = for ((k, v) <- map) yield (k, v * 0.9)
        for ((k, v) <- map2) {
            println("Key is " + k + ", value is " + v)
        }


        val scores = scala.collection.mutable.Map("Hadoop" -> 8, "Spark" -> 10 )
        val hadoopScore = scores.getOrElse("Hadoop", 0)
        println(hadoopScore)
        scores += ("Scala" -> 9)
        scores -= "Hadoop"
        for ((k, v) <- scores) {
            println("Key is " + k + ", value is " + v)
        }

        val sortedScore = scala.collection.immutable.SortedMap( "Hadoop" -> 8, "Spark" -> 10 )

        val tuple =(1,2,3.14,"Rocky","Spark")
        val third = tuple._3
        val (first,second,thirda,fourth,fifth) = tuple
        val (f, s, _, _, _) = tuple

        "Rocky Spark".partition(_.isUpper)

        val symbols = Array("[", "*", "]")
        val counts = Array(2,5,2)
        val pairs = symbols.zip(counts)
        for ((x,y) <- pairs) print(x*y)

    }

}
