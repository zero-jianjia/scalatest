package com.zero.collection

object StringTest {
    def main(args: Array[String]): Unit = {
        test1()
    }
    def test1() {
        val str =
            """zero: "HELLO
    ZERO!" """
        println(str)
        /*zero: "HELLO
                      ZERO!"
        */
        val str1 =
            """zero: "HELLO
              |ZERO| !" """.stripMargin
        println(str1)
/*zero: "HELLO
  ZERO| !" 
*/
    }
}