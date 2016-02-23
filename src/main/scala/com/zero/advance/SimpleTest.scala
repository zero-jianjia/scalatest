package com.zero.advance

/**
  * Created by Inuyasha on 16/01/30.
  */
object SimpleTest {
    def main(args: Array[String]) {
        new Cat().breathe.eat
    }
}

class Animal {def breathe : this.type =this}
class Cat extends Animal{def eat: this.type = this}