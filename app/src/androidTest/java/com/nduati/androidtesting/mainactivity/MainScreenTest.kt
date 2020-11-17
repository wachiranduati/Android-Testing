package com.nduati.androidtesting.mainactivity

import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.nduati.androidtesting.MainActivity
import org.junit.Rule
import org.junit.Test

//1
@LargeTest
class MainScreenTest {

    //2
    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)

    //3
    private val screen = MainScreen()

    //4
    @Test
    fun click_button_should_show_snackbar(){
        screen{
            mainBtn.click()
            ksnack.isDisplayed()
        }
    }

}