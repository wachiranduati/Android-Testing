package com.nduati.androidtesting.mainactivity.searchresults

import android.content.Intent
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import com.nduati.androidtesting.SearchResultsActivity
import org.junit.Rule

import android.view.View
import com.agoda.kakao.recycler.KRecyclerItem
import com.agoda.kakao.recycler.KRecyclerView
import com.agoda.kakao.screen.Screen
import com.agoda.kakao.text.KTextView
import com.nduati.androidtesting.R
import org.hamcrest.Matcher
import org.junit.Test

class Item(parent : Matcher<View>) : KRecyclerItem<Item>(parent){
    val tOne = KTextView(parent){withId(R.id.recyclerTextViewOne)}
    val tTwo = KTextView(parent){withId(R.id.recyclerTextViewTwo)}
}

class SearchResultsScreen : Screen<SearchResultsScreen>() {
    val recycler : KRecyclerView = KRecyclerView({
        withId(R.id.searchResultsRecyclerView)
    }, itemTypeBuilder = {
        itemType(::Item)
    })
}

@LargeTest
class SearchResultsUITests {
    @Rule
    @JvmField
    var rule : ActivityTestRule<SearchResultsActivity> =
        object : ActivityTestRule<SearchResultsActivity>
            (SearchResultsActivity::class.java){

            override fun getActivityIntent(): Intent {
                var targetContext = InstrumentationRegistry
                    .getInstrumentation().targetContext
                var result = Intent(targetContext, SearchResultsActivity::class.java)
                result.putExtra("ingredients", "mangoes, bananas, matoke, grapes")
                return result
            }
        }

    private val screen = SearchResultsScreen()

    @Test
    fun shouldRenderFromRepo(){
        screen{
            recycler{
                hasSize(8)
            }
        }
    }
}

