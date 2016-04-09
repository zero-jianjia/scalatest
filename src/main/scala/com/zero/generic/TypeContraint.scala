package com.zero.generic

//类型约束
object TypeContraint {
    def main(args: Array[String]) {
        //A =:= B  //A类型等同于B类型
        //A <:< B  //A类型是B类型的子类型
        def rocky[T](i: T)(implicit ev: T <:< java.io.Serializable) {
            print(i)
        }
        rocky("Spark")
    }
}