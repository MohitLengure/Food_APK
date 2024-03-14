package com.example.food_apk

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class Firstpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)
        val getstarted=findViewById<Button>(R.id.get_started)
        getstarted.setOnClickListener{
            val intent1= Intent(this, MainActivity::class.java)
            startActivity(intent1)
            Toast.makeText(this,"Button Clicked", Toast.LENGTH_SHORT).show()
        }


    }
}