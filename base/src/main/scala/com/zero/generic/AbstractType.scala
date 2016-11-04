package com.zero.generic

import scala.io.{BufferedSource, Source}

trait Reader{
  type In <: java.io.Serializable
  type Contents
  def read(in: In): Contents
}
class FileReader extends Reader {
  type In = String
  type Contents = BufferedSource
  override def read(name: In)  = Source.fromFile(name)
}
object AbstractType {

  def main(args: Array[String]) {
    val fileReader = new FileReader
    val content = fileReader.read("build.gradle")
    for (line <- content.getLines){
		  println(line)
		}
  }

}