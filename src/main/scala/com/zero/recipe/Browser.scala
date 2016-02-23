package com.zero.recipe


abstract class Browser {
    val database: DataBase

    def recipesUsing(food: Food) =
        SimpleDatabase.allRecipes.filter { recipe => recipe.ingredients.contains(food) }

}