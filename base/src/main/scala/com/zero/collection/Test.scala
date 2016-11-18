package com.zero.collection

import java.util

/**
  * Created by jianjia1 on 16/11/10.
  */
object Test {
    def main(args: Array[String]) {
        val lineitemIdList: util.List[String] = new util.ArrayList[String]()
        lineitemIdList.add("a")
        lineitemIdList.add("b")
//        println(lineitemIdList.iterator().)


        val lineItemIdArrayMap = new util.HashMap[String, Array[String]]

        lineItemIdArrayMap.put("a",lineitemIdList.toArray(Array[String]()))
    }
}
