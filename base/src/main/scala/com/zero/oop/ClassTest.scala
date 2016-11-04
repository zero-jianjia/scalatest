package com.zero.oop

class Person private(val name: String, val age: Int) {
}

object Person {
    def apply(name: String, age: Int): Person = new Person(name, age)
}

class Person001 {
    val name: String = null
    var age: Int = _
    private var gender: String = _
    private val code: String = ""

}

object ClassTest {
    def main(args: Array[String]): Unit = {
        val a = Person("zero", 20)

        val person001 = new Person001
        //set
        person001.age = 12

        //get
        println(person001.age)
        println(person001.name)


    }
}