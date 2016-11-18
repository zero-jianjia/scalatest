package org.zero

import scala.runtime.NonLocalReturnControl
import scala.util.control.ControlThrowable

/**
  * Created by jianjia1 on 16/11/18.
  */
object Test {
    def main(args: Array[String]) {
        println(test)
        println("111")
    }

    def test: Boolean = {
        val list = List("A", "B", "C")
        list.foreach(s => {
            if (s == "D") {
                println("ok, do something.")
                return false
            }
        })

        list.foreach(s => {
            if (s == "C") {
                println("ok, do something.")
                return true
            }
        })
        false
    }
}