package com.zero.recipe

abstract class DataBase {
    def allFoods: List[Food]
    def allRecipes: List[Recipe]

    def foodName(name: String) =
        allFoods.find { _.name == name }

    case class FoodCategory(name: String, foods: List[Food])

    def allCategories: List[FoodCategory]
}