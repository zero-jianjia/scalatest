package com.zero.generic

class Animal { def breathe: this.type = this }
class Cat extends Animal { def eat : this.type = this } 

object ThisType {

  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.breathe.eat//cat.breathe返回的是Cat类型
  }
}
//如果如下，就不能cat.breathe.eat， cat.breathe将返回Animal类型，但其没有eat方法
//class Animal { def breathe = this }
//class Cat extends Animal { def eat = this }