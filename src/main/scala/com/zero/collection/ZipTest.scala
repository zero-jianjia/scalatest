package com.zero.collection

object ZipTest {
    def main(args: Array[String]): Unit = {
        test1()
    }

    def test1() {
val aa = Array("a", "b")
val bb = Array(1, 2)
val pairs = aa.zip(bb)
for ((x, y) <- pairs)
    print(x + "-" + y + "  ") //a-1  b-2  
    }
}