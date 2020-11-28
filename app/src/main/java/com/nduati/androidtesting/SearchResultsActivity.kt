package com.nduati.androidtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SearchResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_results)
        val srchRstsRecVw : RecyclerView = findViewById(R.id.searchResultsRecyclerView)
        val lnlyt : LinearLayoutManager = LinearLayoutManager(this)
        val adp = SearchTextsAdapter()
        srchRstsRecVw.apply {
            setHasFixedSize(true)
            layoutManager = lnlyt
            adapter = adp
        }
    }
}