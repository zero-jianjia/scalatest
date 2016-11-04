package com.zero.generic

// <: UpperBound,表示T必须是Comparable[T]的子类，即 T extends Comparable[T]
class Pair[T <: Comparable[T]](val first: T, val second: T) {
    def bigger = if (first.compareTo(second) > 0) first else second
}

// >: LowerBound,表示R必须是T的父类，即 T extends R
class PairLowerBound[T](val first: T, val second: T) {
    def replaceFirst[R >: T](newFirst: R) = new PairLowerBound[R](newFirst, second)
}

object ULBoundTest {
    def main(args: Array[String]) {
        val pair = new Pair("Spark", "Hadoop")
        println(pair.bigger)
    }
}