package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.secondActivityBtn)
        button.setOnClickListener {
            //TODO:start activity
            val intent = Intent(this, Activity2::class.java)
// start your next activity
            startActivity(intent)
        }
    }
}