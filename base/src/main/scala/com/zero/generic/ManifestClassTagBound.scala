package com.zero.generic

import scala.reflect.ClassTag

/**
  * Created by Inuyasha on 16.04.09.
  */
object ManifestClassTagBound {
    def main(args: Array[String]) {
        //泛型数组，Manifest上下文界定，有Manifest[T]的隐式值，实际上是通过implicit实现
        //Manifest来存储在实际运行时T的具体类型
        def arrayMake[T: Manifest](first: T, second: T) = {
            val r = new Array[T](2)
            r(0) = first
            r(1) = second
            r
        }

        arrayMake(1, 2).foreach(print)
        println()

        //推荐
        def mkArray[T: ClassTag](elems: T*) = Array[T](elems: _*)
        mkArray(42, 13).foreach(print)
        println()
        mkArray("Japan", "Brazil", "Germany").foreach(print)
        println()


        // ClassTag 提供运行时的给定类的类别信息，实际开发中足已
        // TypeTag 除了类的类别信息还包括static type info
    }
}
