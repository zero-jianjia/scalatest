package com.zero.other

object MatchTest {
    def main(args: Array[String]): Unit = {
val arg = "a"
val num =
    arg match {
        case "a" => 1
        case "b" => 2
        case _ => 0
    }
    }
}