package com.zero.oop

/**
  * Created by Inuyasha on 16.03.26.
  */

trait Action {
    def doAction
}

trait TBeforeAfter extends Action {
    abstract override def doAction {
        println("Initialization")
        super.doAction
        println("Destroyed")
    }
}

class Work extends Action {
    override def doAction = println("Working...")
}

object AOPTest {
    def main(args: Array[String]) {
        val work = new Work with TBeforeAfter
        work.doAction
    }
}
