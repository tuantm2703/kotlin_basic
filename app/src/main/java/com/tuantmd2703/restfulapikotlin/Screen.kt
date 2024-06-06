package com.tuantmd2703.restfulapikotlin

sealed class Screen(val route: String) {
    data object RecipeScreen: Screen("recipeScreen")
    data object DetailScreen: Screen("detailScreen")
}