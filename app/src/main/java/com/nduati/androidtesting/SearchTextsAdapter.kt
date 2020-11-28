package com.nduati.androidtesting

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class searchItems(val textOne : String, val textTwo : String)

class SearchTextsAdapter() : RecyclerView.Adapter<SearchTextsAdapter.SearchItems>() {
    lateinit var content : List<searchItems>
    init {
        content = listOf(
            searchItems("mango", "banana"),
            searchItems("klsd", "dfsg"),
            searchItems("juice", "jus"),
            searchItems("strawberry", "strberry"),
            searchItems("soursop", "banana"),
            searchItems("lemon", "lmnk"),
            searchItems("ginger", "kljsd"),
            searchItems("avocado", "hallelujah")
        )
    }

    class SearchItems(view: View) : RecyclerView.ViewHolder(view){
        val txtOne : TextView = view.findViewById(R.id.recyclerTextViewOne)
        val txtTwo : TextView = view.findViewById(R.id.recyclerTextViewTwo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchItems {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return SearchItems(view)
    }

    override fun onBindViewHolder(holder: SearchItems, position: Int) {
        holder.txtOne.text = content[position].textOne
        holder.txtTwo.text = content[position].textTwo
    }

    override fun getItemCount(): Int {
        return content.size
    }
}