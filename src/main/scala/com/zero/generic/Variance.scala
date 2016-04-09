package com.zero.generic

class Person

class Student extends Person

class C[+T](val args: T)//+协变， C[Student]是C[Person]的子类型
class S[+T](arg: T) extends C[T](arg)//需要保持与C一样的+T

trait Friend[-T] {//-逆变
    def makeFriend(somebody: T)
}

object Variance {
    def makeFriendWithYou(s: Student, f: Friend[Student]) {f.makeFriend(s) }
    def main(args: Array[String]) {
        val value: C[Person] = new C[Student](new Student)

        //    List<? extends Oject> list = new ArrayList<String>()
        val list: List[_ <: Any] = List[String]("Spark")
    }
}