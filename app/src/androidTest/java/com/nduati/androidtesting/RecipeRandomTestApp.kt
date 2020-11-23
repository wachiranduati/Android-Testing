package com.nduati.androidtesting

class RecipeRandomTestApp : RandomTesterRepo() {
    override fun getRecipes(): List<String> {
        return listOf("banana", "mango", "orange", "pawpaw")
    }
}