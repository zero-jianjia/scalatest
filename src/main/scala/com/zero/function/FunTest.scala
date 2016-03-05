package com.zero.function

object FunTest {
    def main(args: Array[String]) {
        test1
        println()
        test2
    }

    def test2: Unit = {
        //带函数参数的函数
        def getValue(arg: Int, f: (Int) => Int) = {
            //接受Int返回Int的函数
            f(arg)
        }
        println(getValue(7, (x: Int) => x + 1)) //8
    }

    def test1: Unit = {
        //作为值的函数
        val f1 = (x: Int) => print(x)
        def f2(x: Int) {
            print(x)
        }
        val f3 = f2 _ //必须要加上 _, 表示f3是一个函数，而不是忘了给f2传入参数
        Array(1, 2).map(f1)
        Array(1, 2).map(f2)
        Array(1, 2).map(f3)


        println()
        //匿名函数
        Array(1, 2).map((x: Int) => print(x))
        Array(1, 2).map(x => print(x)) //简化
        Array(1, 2).map(_ => print(_)) //如果参数只一个，可以进一步简化
        Array(1, 2).map(print _) //is OK

        Array(1, 2) map { (x: Int) => print(x) } //同上

    }
}


