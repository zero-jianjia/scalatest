package com.zero.pattern_match

object OptionTest {

  def main(args: Array[String]){
    val scores = Map("Alice" -> 99, "Spark" -> 100)
    
    scores.get("Alicde") match {
	  case Some(score) => println(score)
	  case None => println("No score")
	}
       
  }

}