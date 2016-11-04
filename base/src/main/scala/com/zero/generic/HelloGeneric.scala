package com.zero.generic

import scala.collection.immutable.Queue
import scala.reflect.ClassTag

//ClassTag可以RunTime级别上提供更多的上下文信息，
class Triple[F: ClassTag, S, T](val first: F, val second: S, val third: T)

//泛型
object HelloGeneric {
    def main(args: Array[String]) {
        val triple = new Triple("Spark", 3, 3.1415)
        val bigData = new Triple[String, String, Char]("Spark", "Hadoop", 'R')

        def getData[T](list: List[T]) = list(list.length / 2)
        println(getData(List("Spark", "Hadoop", 'R')))
        val f = getData[Int] _
        println(f(List(1, 2, 3, 4, 5, 6)))

        val queue = Queue(1, 2, 3, 4, 5)
        val queue_appended = queue enqueue 6
        println("queue : " + queue + "   " + "queue_appended : " + queue_appended)
    }
}