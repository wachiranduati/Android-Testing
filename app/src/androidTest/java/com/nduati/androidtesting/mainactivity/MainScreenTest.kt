package com.nduati.androidtesting.mainactivity

import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import com.agoda.kakao.intent.KIntent
import com.nduati.androidtesting.MainActivity
import com.nduati.androidtesting.SecondActivity
import org.junit.Rule
import org.junit.Test

//1
@LargeTest
class MainScreenTest {

    //2
    @Rule
    @JvmField
    val rule = IntentsTestRule(MainActivity::class.java)

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

    @Test
    fun click_to_navigate_to_other_screen(){
        screen{
            val query = "This is a snackbar"
            inptBox.clearText()
            inptBox.typeText(query)
            closeSoftKeyboard()
            navigtBtn.click()

            val secondActIntent = KIntent{
                hasComponent(SecondActivity::class.java.name)
                hasExtra("QUERY", query)
            }
            secondActIntent.intended()
        }
    }

}