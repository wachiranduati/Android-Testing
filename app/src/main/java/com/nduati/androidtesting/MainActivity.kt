package com.nduati.androidtesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var mnEdtxt : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.main_button)
        val navToPage2 : Button = findViewById(R.id.navigate_to_page2_button)
        mnEdtxt = findViewById(R.id.mainEditText)
        btn.setOnClickListener(this)
        navToPage2.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.main_button -> {
                Snackbar.make(v, "This is a snackbar", Snackbar.LENGTH_LONG).show()
            }
            R.id.navigate_to_page2_button ->{
                val edVal = mnEdtxt.text.toString()
                val intent : Intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("QUERY", edVal)
                startActivity(intent)
            }
        }
    }
}