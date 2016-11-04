package com.zero.recipe

object Apple extends Food("Apple")
object Orange extends Food("Orange")
object Cream extends Food("Cream")
object Sugar extends Food("Sugar")

object FruitSalad extends Recipe(
    "FruitSalad",
    List(Apple, Orange, Cream, Sugar),
    "Stir it all together") {

}