package com.zero.recipe

object SimpleDatabase extends DataBase {
    def allFoods = List(Apple, Orange, Cream, Sugar)
    def allRecipes: List[Recipe] = List(FruitSalad)

    private var categories = List(
        FoodCategory("fruits", List(Apple, Orange)),
        FoodCategory("misc", List(Cream, Sugar)))

    def allCategories = categories
}

