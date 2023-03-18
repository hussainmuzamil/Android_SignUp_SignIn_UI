package com.example.assignment_03

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var button : Button = findViewById(R.id.button4)
        button.setOnClickListener(){
            var intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }
    }
}