package com.zero.recipe

object MainTest {
    def main(args: Array[String]): Unit = {
        val apple = SimpleDatabase.foodName("Apple").get
        println(apple)

        val result = SimpleBrowser.recipesUsing(apple)
        println(result)
    }
}