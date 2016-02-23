package com.zero.oop

/**
  * Created by jianjia1 on 2016/1/29.
  */
object HelloOOp {
    class Person {
        private var age = 0
        def increment() {
            age += 1
        }
        def current = age
    }

    class Student {
        private var privateAge = 0
        val name = "Scala"
        def age = privateAge
        def isYounger(other: Student) = privateAge < other.privateAge
    }
    def main(args: Array[String]): Unit = {
        val person = new Person()
        person.increment()
        person.increment()
        println(person.current)
        //
        //    val student = new Student
        //    student.age = 10
        //    println(student.age)

        val student = new Student
        println(student.name)
    }
}
