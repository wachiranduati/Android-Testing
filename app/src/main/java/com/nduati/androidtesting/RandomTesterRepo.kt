package com.nduati.androidtesting

open class RandomTesterRepo {
    //this is meant to mock a request to some remote service
    val recipesMulti = listOf<String>("omlette", "friend sunday", "ugali managu", "grilled tomatoes")
    open fun getRecipes() : List<String>{
        return recipesMulti
    }
}