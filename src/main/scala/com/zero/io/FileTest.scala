package com.zero.io

import scala.io.Source
import java.io.PrintWriter
import java.io.File

object FileTest {
    def main(args: Array[String]): Unit = {
        val file = Source.fromFile("build.gradle")
        for (line <- file.getLines()) { println(line) }
        file.close()
        
        val writer = new PrintWriter(new File("test.txt"))
        writer.print("hello world!")
        writer.close()
    }
}