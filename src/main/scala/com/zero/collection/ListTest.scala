package com.zero.collection

/**
  * Created by jianjia1 on 2016/1/29.
  */
object ListTest {
    def main(args: Array[String]) {
        val data = List(1, 2, 3)
        printList(data)
        println(data.isEmpty)
        println(data.head)
        println(data.tail.head)

        //右结合
        val bigData_Core = "Hadoop" :: ("Spark" :: Nil)
        val data_Int = 1 :: 2 :: 3 :: Nil
        printList(bigData_Core)
        printList(data_Int)

        val List(a, b) = bigData_Core
        println("a : " + a + ", " + " b: " + b) //a : Hadoop,  b: Spark
        val x :: y :: rest = data_Int
        println("x : " + x + ", " + " y: " + y + ", " + rest) //x : 1,  y: 2, List(3)

        println(List.apply(1, 2, 3))
        println(List.range(1, 5))
        println(List.range(9, 1, -3))

        val zipped = "abcde".toList zip List(1, 2, 3, 4, 5)
        println(zipped)
        println(zipped.unzip)
        println()
        println(List(List('a', 'b'), List('c'), List('d', 'e')).flatten)
        println(List.concat(List(), List('b'), List('c')))


        val shuffledData = List(6,3,5,6,2,9,1)
        println(sortList(shuffledData))

        def sortList(list : List[Int]): List[Int] = list match{
            case List() => List()
            case head :: tail  => compute (head, sortList(tail))
        }

        def compute(data : Int , dataSet : List[Int]) : List[Int] = dataSet match{
            case List() => List(data)
            case head :: tail  => if (data <= head) data :: dataSet
                                  else  head :: compute(data, tail)
        }

    }

    def printList[T](list: List[T]): Unit = {
        for (x <- list) {
            print(x + " ")
        }
        println()
    }

}
