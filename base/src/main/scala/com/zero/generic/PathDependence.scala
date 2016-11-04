package com.zero.generic

class Outer {
    private val x = 10

    class Inner {
        private val y = x + 10//内部类隐含的持有外部类实例，可以访问外部类private成员
    }

}

//sacla中内部类必须依赖外部类，
object PathDependence {
    def main(args: Array[String]) {
        val o1 = new Outer
        val o2 = new Outer

        val inner1: o1.Inner = new o1.Inner//路径依赖类型
        val inner2: o2.Inner = new o2.Inner

        //error : val inner2: o2.Inner = new o1.Inner

        val inner: Outer#Inner = new o1.Inner// Outer#Inner是o1.Inner的父类
    }
}