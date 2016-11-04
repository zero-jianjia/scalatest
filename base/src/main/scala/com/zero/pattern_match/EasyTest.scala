package com.zero.pattern_match

/**
  * Created by jianjia1 on 2016/1/29.
  */
object EasyTest {
    def main(args: Array[String]) {
        val data = 2
        data match {
            case 1 => println("First")
            case 2 => println("Second")
            case _ => println("Not Known Number")
        }

        val result = data match {
            case i if i == 1 => "The First"
            case number if number == 2 => "The Second " + number
            case _ => "Not Known Number"
        }
        println(result)

        "Spark !" foreach { c => print(
            c match {
                case ' ' => " space "
                case ch => "Char: " + ch + ", "
            }
        )
        }

        println()


        val pattern = "([0-9]+) ([a-z]+)".r
        "20150628 hadoop" match {
            case pattern(num, item) => println(num + " --- " + item)
        }

        val scores = Map("Alice" -> 99, "Spark" -> 100)
        scores.get("Alice") match {
            case Some(score) => println(score)
            case None => println("No score")
        }
        scores.get("Alicde") match {
            case Some(score) => println(score)
            case None => println("No score")
        }
    }
}
