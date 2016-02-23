package com.zero.traittest

class B {
    override def toString = "class B"
}

trait TraitA {
    def fun() {
        println("this is traitA")
    }
}
trait TraitB {
    def fun2() {
        println("this is traitB")
    }
}

class A extends B with TraitA {
    override def toString = "class A"
}

object TraitTest {
    def main(args: Array[String]): Unit = {
        val a = new A with TraitB
        a.fun()

        val b: TraitA = a
        b.fun()
    }
}