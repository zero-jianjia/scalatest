package com.zero.oop

/**
  * Created by jianjia1 on 2016/1/29.
  */
object HelloOOp {
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

    def main(args: Array[String]): Unit = {
        val outer1 = new Outer("Spark")
        val outer2 = new Outer("Hadoop")
        val inner1 = new outer1.Inner("Scala")
        val inner2 = new outer2.Inner("Java")
        inner1.foo(inner1);
        inner2.foo(inner2);

    }

}

class Outer(val name: String) { outer =>
    class Inner(val name: String){
        def foo(b: Inner) = println("Outer: " + outer.name +
            " Inner: " + b.name)
    }

}