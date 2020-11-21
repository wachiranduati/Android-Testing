package com.nduati.androidtesting

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Handler().postDelayed({
            val retIntent = Intent()
            retIntent.putExtra("RESP", "This is returned text")
            setResult(Activity.RESULT_OK,retIntent)
            finish()
        }, 200)
    }
}