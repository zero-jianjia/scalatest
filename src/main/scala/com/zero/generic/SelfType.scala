package com.zero.generic

class Self { //self => 设置别名
    self =>
    val tmp = "Scala"
    def foo = self.tmp + this.tmp
}

trait S1

class S2 {
    this: S1 =>
}

class S3 extends S2 with S1

trait T {
    this: S1 =>
}

object S4 extends T with S1

object SelfType {
    def main(args: Array[String]) {
        class Outer {
            outer =>
            val v1 = "Spark"

            class Inner {
                println(outer.v1)
            }

        }
        val c = new S2 with S1
    }
}