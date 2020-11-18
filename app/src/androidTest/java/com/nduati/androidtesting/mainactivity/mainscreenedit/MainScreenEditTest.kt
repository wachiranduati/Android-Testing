package com.nduati.androidtesting.mainactivity.mainscreenedit

import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.nduati.androidtesting.MainActivity
import org.junit.Rule
import org.junit.Test

@LargeTest
class MainScreenEditTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)

    private val screen = MainEditScreen()

    @Test
    fun type_edit_text_click_button_no_snackbar(){
        screen{
            mainEdtTxt.typeText("This is some random text")
            mainEdtBtn.click()
            snackEdtBar.doesNotExist()
        }
    }

}