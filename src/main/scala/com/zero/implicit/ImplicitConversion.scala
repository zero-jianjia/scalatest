package com.zero

import java.io.File
import scala.io.Source

class RichFile(val file: File) {
    def read = Source.fromFile(file.getPath()).mkString
}

object Context {
    implicit def file2RichFile(file: File) = new RichFile(file) //File -> RichFile
}

object ImplicitConversion {
    def main(args: Array[String]) {
        import Context.file2RichFile
        println(new File("build.gradle").read)
    }
}