package com.zero.base

/**
  * Created by Inuyasha on 16/01/30.
  */
object Test {
    def main(args: Array[String]) {
        def arrayMake[T](first: T, second: T) = {
            val r = new Array[T](2)
            r(0) = first
            r(1) = second
            r
        }

    }
}
