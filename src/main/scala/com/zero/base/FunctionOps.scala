package com.zero.base

object FunctionOps {
    def main(args: Array[String]) {
        var increase = (x: Int) => x + 1
        println(increase(10))
        increase = (x: Int) => x + 9999

        val someNumbers = List(-11, -10, -5, 0, 5, 10)
        someNumbers.foreach((x: Int) => print(x))
        println
        someNumbers.filter((x: Int) => x > 0).foreach((x: Int) => print(x))
        println
        someNumbers.filter((x) => x > 0).foreach((x: Int) => print(x))
        println
        someNumbers.filter(x => x > 0).foreach((x: Int) => print(x))
        println
        someNumbers.filter(_ > 0).foreach((x: Int) => print(x))
        println
        val f = (_: Int) + (_: Int)
        println(f(5, 10))

        def fac(n: Int): Int = if (n <= 0) 1 else n * fac(n - 1)
        println("The result from a fac is : " + fac(10))

        def combine(content: String, left: String = "[", right: String = "]") = left + content + right
        println("The result from a combine is : " + combine("I love Spark", " << "))

        def connected(args: Int*) = {
            var result = 0
            for (arg <- args) result += arg
            result
        }
        println("The result from a connected is : " + connected(1, 2, 3, 4, 5, 6))

    }

    //默认参数和带名参数
    def test(): Unit = {
        def decorate(str: String, left: String = "[", right: String = "]") = {
            left + str + right
        }

        decorate("zero") //---> [zero]
        decorate("zero", "{") //--->{zero]
        decorate("zero", right = "}") //--->[zero}
    }


    //变长参数
    def test1: Unit = {
        def sum(args: Int*) = {
            var result = 0
            for (arg <- args) result += arg
            result
        }
        sum(1, 2, 3) //--->6

        //sum(1 to 5),错误
        sum(1 to 5: _*) // _*用来转换为参数序列
    }

}
