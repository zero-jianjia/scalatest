package com.zero.clazz

class Person private (val name: String, val age: Int) {
}

object Person {
    def apply(name: String, age: Int): Person = new Person(name, age)
}

object ClassTest {
    def main(args: Array[String]): Unit = {
        val a = Person("zero", 20)
    }
}