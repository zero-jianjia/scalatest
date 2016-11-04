package com.zero.generic

//class Pair_NotPerfect[T <: Comparable[T]](val first : T,val second : T){
//  def bigger = if(first.compareTo(second) > 0)first else second  
//}
//<%，视图界定，将T类型的实例转换为Comparable[T]类型,会有隐式转化，例如Int -> RichInt
class PairNotPerfect[T <% Comparable[T]](val first: T, val second: T) {
    def bigger = if (first.compareTo(second) > 0) first else second
}

//更好，String -> RichString，RichString是Ordered的子类，支持 < > =
class PairBetter[T <% Ordered[T]](val first: T, val second: T) {
    def bigger = if (first > second) first else second
}

object ViewBoundTest {
    def main(args: Array[String]) {
        val pair = new PairNotPerfect("Spark", "Hadoop")
        println(pair.bigger)

        val pairInt = new PairNotPerfect(3, 5) //Int -> RichInt
        println(pairInt.bigger)

        val pair_Better_String = new PairBetter("Java", "Scala") //String -> RichString
        println(pair_Better_String.bigger)

        val pair_Better_Int = new PairBetter(20, 12)
        println(pair_Better_Int.bigger)
    }
}