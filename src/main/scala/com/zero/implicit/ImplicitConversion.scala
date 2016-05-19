package com.zero

import java.io.File
import scala.io.Source

class RichFile(val file: File) {
    def read = Source.fromFile(file.getPath()).mkString
}

object Context {
    implicit def file2RichFile(file: File) = new RichFile(file)
    
    implicit def int2Fraction(n: Int) = new Fraction(1, n)
}

class Fraction(val x: Int, val y: Int) {
    def add(other: Fraction) = {
        1
    }
}

object ImplicitConversion {
    def main(args: Array[String]) {
        import Context._
        println(new File("build.gradle").read)
        val result = 7.add(new Fraction(1, 2))
    }
}