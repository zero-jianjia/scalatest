package com.zero.collection

object ZipTest {
    def main(args: Array[String]): Unit = {
        test1()


        val symbols = Array("[", "*", "]")
        val counts = Array(2, 5, 2)
        val pairs = symbols.zip(counts)
        for ((x, y) <- pairs) print(x * y)
    }

    def test1() {
        val aa = Array("a", "b")
        val bb = Array(1, 2)
        val pairs = aa.zip(bb)
        for ((x, y) <- pairs)
            print(x + "-" + y + "  ") //a-1  b-2
    }
}