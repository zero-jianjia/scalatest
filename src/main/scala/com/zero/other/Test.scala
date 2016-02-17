package com.zero.other

import scala.collection.mutable.ArrayBuffer
import java.util.Arrays

class Person {
    var name: String = _
    private var age = 20;
    private[this] var gender = 20; //仅对象在自己的class中访问

    def this(name: String) { //实际上this是重载了主构造器,使用new Person()依然可以创建对象
        this //默认构造器，即主构造器，class Person实际上省略了(),class Person()是主构造器
        this.name = name
        println("over")
    }

    def increat() { age += 1 }
    def current() = age //或则def current = age
}

class Student private () { //使用new Student()不能创建对象
    var name: String = _
    private var age = 20;
    private[this] var gender = 20; //仅对象在自己的class中访问

    def this(name: String) { //实际上this是重载了主构造器,使用new Person()依然可以创建对象
        this //默认构造器，即主构造器，class Person实际上省略了(),class Person()是主构造器
        this.name = name
        println("over")
    }

    def increat() { age += 1 }
    def current() = age //或则def current = age
}

object Test {
    def main(args: Array[String]): Unit = {
        //test1
        //test2
        //test3
        //test4
        //test5
    }


    def test6 {
        val per = new Person("zero")
        per.increat()
        println(per.current())
        println(per.name)

        val stu = new Student("")
    }



    def test4 {
        val b = ArrayBuffer[Int]()
        b += 1
        b += (2, 3)
        b ++= Array(2, 4, 5) //均追加

        b.trimEnd(5) //移除末尾5个数字

        val c = Array(2, 4, 5)
        val result = for (elem <- c) yield elem * 2
        println(Arrays.toString(result))

        c.filter(_ % 2 == 0).map(_ * 2)

        val sum = Array(2, 4, 5).sum
        println(sum)

        val sort = Array(2, 8, 5).sorted
        println(Arrays.toString(sort))

        val sort1 = Array(2, 8, 5)
        scala.util.Sorting.quickSort(sort1)
        println(Arrays.toString(sort1))

        val str = sort1.mkString("{", ",", "}")
        println(str)

        //矩阵定义
        val matrix = Array.ofDim[Double](3, 5)
    }

    def test3 {
     

        def addA(x: Int) = x + 100
        //等效与
        val add = (x: Int) => x + 100
        println(addA(5) == add(5))

        //递归函数需要显式指明返回值类型
        def fac(n: Int): Int = if (n == 1) n else fac(n - 1) * n
        println(fac(5))

        //为函数参数提供默认值
        def combine(content: String, left: String = "[", right: String = "]") = left + content + right
        println(combine("aaa"))
        println(combine("aaa", "{"))

        //可变参数
        def connect(args: Int*) = {
            var sum = 0;
            for (i <- args) sum += i;
            sum
        }
        println(connect(1, 23, 3))
    }

    def test1() {
       
    }


}