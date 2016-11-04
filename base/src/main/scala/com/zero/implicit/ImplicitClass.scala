package com.zero

import java.io.File
import scala.io.Source

object Context_Helper {

    implicit class FileEnhancer(file: File) {
        def read = Source.fromFile(file.getPath).mkString
    }

    implicit class Op(x: Int) {
        def addSAP(second: Int) = x + second
    }
}

object ImplicitClass {
    def main(args: Array[String]) {
        import Context_Helper._
        println(1.addSAP(2))
        println(new File("build.gradle").read)
    }
}