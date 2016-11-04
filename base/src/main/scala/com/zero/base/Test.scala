package com.zero.base

/**
  * Created by Inuyasha on 16/01/30.
  */
object Test {
    def main(args: Array[String]) {
        class Stu(name: String) {
            def this(){
                this(null)
            }
        }

        val stu = new Stu()
        println(stu)
    }
}
