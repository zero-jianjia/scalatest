package com.zero.collection

import scala.collection.immutable.Queue

/**
  * Created by jianjia1 on 2016/1/29.
  */
object ListBuffer_Queue_StackTest {
    def main(args: Array[String]) {
        testListBuffer
    }

    def testListBuffer: Unit = {
        import scala.collection.mutable.ListBuffer
        val listBuffer = new ListBuffer[Int]
        listBuffer += 1
        listBuffer += 2
        listBuffer += 3
        listBuffer += 4
        println(listBuffer)

        val iterator = listBuffer.iterator.filter(_ > 2).toList
        println(iterator)
        println(listBuffer.filter(_ > 2))
    }

    def test: Unit = {
        import scala.collection.mutable.ArrayBuffer
        val arrayBuffer = new ArrayBuffer[Int]()
        arrayBuffer += 1
        arrayBuffer += 2
        println(arrayBuffer)


        val empty = Queue[Int]()
        val queue1 = empty.enqueue(1)
        val queue2 = queue1.enqueue(List(2, 3, 4, 5))
        println(queue2)
        val (element, left) = queue2.dequeue
        println(element + " : " + left)

        import scala.collection.mutable.Queue
        val queue = Queue[String]()
        queue += "a"
        queue ++= List("b", "c")
        println(queue)
        println(queue.dequeue)
        println(queue)

        import scala.collection.mutable.Stack
        val stack = new Stack[Int]
        stack.push(1)
        stack.push(2)
        stack.push(3)
        println(stack.top)
        println(stack)
        println(stack.pop)
        println(stack)
    }


}
