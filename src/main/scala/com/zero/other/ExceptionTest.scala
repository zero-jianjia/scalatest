package com.zero.other

object ExceptionTest {
    def main(args: Array[String]): Unit = {
        val arg = 2

        try {
            val a = if (false) 1 else throw new IllegalArgumentException("null")
        } catch {
            case e: IllegalArgumentException => println(e.getMessage)
            case e: Exception => println(e.getMessage)
        } finally {
            println("finally")
        }
    }
}