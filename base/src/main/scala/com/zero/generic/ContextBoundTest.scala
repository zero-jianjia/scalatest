package com.zero.generic


import java.util.Comparator
/**
  * Created by jianjia1 on 16/04/08.
  */
//T也是Ordering[T]类型
class Pair_Ordering[T: Ordering](val first: T, val second: T) {
    def bigger(implicit ordered: Ordering[T]) = {
        if (ordered.compare(first, second) > 0) first else second
    }
}

object ContextBoundTest {
    def main(args: Array[String]) {
        val pair = new Pair_Ordering("Spark", "Hadoop")
        println(pair.bigger)

        val pairInt = new Pair_Ordering(3, 5)
        println(pairInt.bigger)
    }
}
