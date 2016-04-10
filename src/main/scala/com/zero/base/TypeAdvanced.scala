package com.zero.base

import scala.reflect.runtime.universe._

class Spark
trait Hadoop
object Flink
class Java {
    class Scala
}

object TypeAdvanced {
    def main(args: Array[String]) {
        println(typeOf[Spark]) //com.zero.base.Spark
        println(classOf[Spark]) //class com.zero.base.Spark
        //Class[_ <: Spark],
        val spark = new Spark
        
        println(classOf[Hadoop])//interface com.zero.base.Hadoop
        println(typeOf[Hadoop])//com.zero.base.Hadoop
        
        println(Flink.getClass)//class com.zero.base.Flink$
        //    println(classOf[Flink]), error
        
        val java1 = new Java
        val java2 = new Java
        val scala1 = new java1.Scala
        val scala2 = new java2.Scala
        println(scala1.getClass)
        println(scala2.getClass)
        println(typeOf[java1.Scala] == typeOf[java2.Scala])
        println(typeOf[java1.Scala])
        println(typeOf[java2.Scala])
        
        println(classOf[List[Int]] == classOf[List[String]])
        println(typeOf[List[Int]] == typeOf[List[String]])
    }
}