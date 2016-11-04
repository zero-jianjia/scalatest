package com.zero.pattern_match

/**
  * Created by jianjia1 on 2016/1/29.
  */

abstract class Person

//默认val
case class Student(age: Int) extends Person

case class Worker(age: Int, salary: Double) extends Person

case object Shared extends Person

object CaseClassMatchTest {
    def main(args: Array[String]) {
        def caseOps(person: Person) = person match {
            case Student(age) => println("I am " + age + " years old")
            case Worker(_, salary) => println("Wow, I got " + salary)
            case Shared => println("No property")
        }
        caseOps(Student(19))
        caseOps(Shared)

        val worker = Worker(29, 10000.1)
        println(worker) //Worker(29,10000.1)
        println(worker.copy())//Worker(29,10000.1)
        val worker2 = worker.copy(salary = 19.95)
        println(worker2) //Worker(29,19.95)
        val worker3 = worker2.copy(age = 30)
        println(worker3) //Worker(30,19.95)


        def caseclass_nested(person: Item) = person match {
            case Bundle(_, _, art@Book(_, _), rest@_*) => println(art.description + " : " + art.price)
            case Bundle(_, _, Book(descr, _), _*) => println("The first description is :" + descr)
            case _ => println("Oops!")
        }
        caseclass_nested(Bundle("1111 Special's", 30.0,
            Book("Scala for the Spark Developer", 69.95),
            Bundle("Hadoop", 40.0,
                Book("Hive", 79.95),
                Book("HBase", 32.95)
            )
        ))
        caseclass_nested(Bundle("1212 Special's", 35.0,
            Book("Spark for the Impatient", 39.95)
        ))
    }
}


abstract class Item

case class Book(description: String, price: Double) extends Item

case class Bundle(description: String, price: Double, items: Item*) extends Item