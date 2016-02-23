package com.zero.oop

import scala.reflect.ClassTag

/** 泛型
  * Created by Inuyasha on 16/01/30.
  */
object TypeParaTest {
  def main(args: Array[String]) {
    test2()
  }

  def test2(): Unit = {
    val pair = new Pair("a", "b")
    println(pair.bigger)

    println(new Pair_B(1, 2).bigger)

    println(new Pair_Better("a", "b").bigger)//String ---> RichString
  }


  def test1(): Unit = {
    val tripe = new Triple("scala", 13, 16.5)
    val tripe2 = new Triple[String, Int, Double]("scala", 13, 16.5)

    def getData[T](list: List[T]) = list(list.length - 1)
    println(getData(List("a", "b")))

    val f = getData[Int] _
    println(f(List(1, 2)))
  }
}

/**
  *
  */
class Pair_Better[T <% Ordered[T]](val first: T, val second: T) {
  def bigger = if (first < second) first else second
}

/** 视图界定
  * 把 T 转换为 Comparable[T] 类型，
  * 如果不是则隐式转换为Comparable[T]类型，例如Int ---> RichInt
  */
class Pair_B[T <% Comparable[T]](val first: T, val second: T) {
  def bigger = if (first.compareTo(second) > 0) first else second
}

class Pair_Lower[T](val first: T, val second: T) {
  //R 是 T 的父类，即 T 是 R 的子类
  def replaceFirst[R >: T](newFirst: R) = new Pair_Lower[R](newFirst, second)
}

/**
  * T 必须是Comparable[T]的子类
  */
class Pair[T <: Comparable[T]](val first: T, val second: T) {
  def bigger = if (first.compareTo(second) > 0) first else second
}

class Triple[F: ClassTag, S, T](val first: F, val second: S, val three: T)