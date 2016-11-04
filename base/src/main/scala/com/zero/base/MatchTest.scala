package com.zero.base

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