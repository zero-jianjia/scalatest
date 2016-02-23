package com.zero.base

/**
  * Created by Inuyasha on 16/01/30.
  */


object ContextBoundsTest {
    def main(args: Array[String]): Unit = {
        val pair = new Pair("a", "b")
        println(pair.bigger)

        val pair2 = new Pair(1, 3)
        println(pair2 bigger)
    }
}

//上下文界定, Ordering为关键字
class Pair[T: Ordering](val first: T, val second: T) {
    //隐式参数，implicit(不言明; 内含的)
    def bigger(implicit ordered: Ordering[T]) = {
        if (ordered.compare(first, second) > 0) first else second
    }
}


/**
  * A =:= B ,A类型等同于B类型
  * A <:< B , A类型是B类型的子类型
  *
  */