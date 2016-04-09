package com.zero

import java.io.File
import scala.io.Source

class RicherFile(val file: File) {
    def read = Source.fromFile(file.getPath()).mkString
}

class FileImplicit(path: String) extends File(path)
object FileImplicit {
    implicit def file2RicherFile(file: File) = new RicherFile(file) //File -> RicherFile
}

object ImplicitInternal {
    def main(args: Array[String]) {
        println(new FileImplicit("build.gradle").read)
    }
}