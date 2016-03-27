package com.zero.oop

/**
  * Created by jianjia1 on 2016/1/29.
  */

trait Logger {
    //  def log (msg : String)
    def log(msg: String) {}
}

class ConcreteLogger extends Logger with Cloneable {

    //  override def log(msg : String) = println("Log: " + msg)

    def concreteLog {
        log("It's me !!!")
    }
}

trait TraitLogger extends Logger {
    override def log(msg: String) {
        println(" TraitLogger Log content is : " + msg)
    }
}

trait TraitLoggered {
    def loged(msg: String) {
        println("TraitLoggered Log content is : " + msg)
    }
}

trait ConsoleLogger extends TraitLogger {
    override def log(msg: String) {
        println("Log from Console :" + msg)
    }
}

class Test extends ConsoleLogger {
    def test {
        log("Here is Spark!!!")
    }

}

abstract class Account {
    def save
}

class MyAccount extends Account with ConsoleLogger {
    def save {
        log("11")
    }
}


object UseTrait extends App {
    //  val logger = new ConcreteLogger with TraitLogger
    ////  val logger = new ConcreteLogger
    //  logger.concreteLog
    //	val logger = new Test
    //	logger.test;
    //
    //  val account = new MyAccount with TraitLoggered
    //  account.save

}
