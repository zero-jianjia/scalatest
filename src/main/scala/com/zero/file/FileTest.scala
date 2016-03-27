package com.zero.file

import scala.io.Source

/**
  * Created by jianjia1 on 2016/1/29.
  */
object FileTest {
    def main(args: Array[String]) {
        val file = Source.fromFile("build.gradle")
        for (line <- file.getLines) {
            println(line)
        }
        file.close

        //      val webFile = Source.fromURL("http://spark.apache.org/")
        //		webFile.foreach(print)
        //		webFile.close

        //        val writer = new PrintWriter(new File("scalaFile.txt" ))
        //        for (i <- 1 to 100) writer.println(i)
        //        writer.close()

    }
}
