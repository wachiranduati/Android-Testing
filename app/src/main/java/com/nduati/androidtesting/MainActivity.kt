package com.nduati.androidtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.main_button)
        btn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.main_button -> {
                Snackbar.make(v, "This is a snackbar", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}