package com.zero.base

object EnumTest {
    def main(args: Array[String]) {
        for (c <- TrafficLightColor.values) {
            println(c.id) //注意这里的c类型是TrafficLightColor.value，而不是TrafficLightColor，推荐增加一个类型别名
        }

        //根据ID或名称获取对应的枚举值
        TrafficLightColor.apply(2)
        TrafficLightColor.withName("red")
    }
}

object TrafficLightColor extends Enumeration {
    //    type TrafficLightColor = Value
    val RED, YELLOW, GREEN = Value

    //这里定义了三个枚举类型，用Value调用将它们初始化。是如下代码的简写
    //val RED = Value
    //val YELLOW = Value
    //val GREEN = Value

    //当然也可以向Value方法传入ID、名称
    val red = Value(6)
    //名称为字段名，red
    val yellow = Value(9, "yellow")
    val green = Value("green") //ID为10，ID不指定则为前一个枚举值ID值的加一后的值，从零开始。缺省名称为字段名
}