package com.example.assignment_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button : Button = findViewById(R.id.button)
        button.setOnClickListener(){
            var intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}