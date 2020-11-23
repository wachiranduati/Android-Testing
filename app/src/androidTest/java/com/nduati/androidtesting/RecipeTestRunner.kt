package com.nduati.androidtesting

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner

class RecipeTestRunner : AndroidJUnitRunner() {
    @Throws(
            InstantiationException::class,
            IllegalAccessException::class,
            ClassNotFoundException::class
    )

    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application {
        return super.newApplication(cl, RecipeRandomTestApp::class.java.name, context)
    }
}