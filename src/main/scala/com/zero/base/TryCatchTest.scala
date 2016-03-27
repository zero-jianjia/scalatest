package com.zero.base

/**
  * Created by Inuyasha on 16.03.26.
  */
object TryCatchTest {
    def main(args: Array[String]) {
        try {
            val a = 5 / 1
            throw new Exception("error")
        } catch {
            case e: Exception => {
                e.printStackTrace()
                println("error")
            }
        } finally {
            println("finally")
        }
    }
}
