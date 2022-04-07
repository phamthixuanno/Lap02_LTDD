package com.example.findmyageapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buGetAge: Button = findViewById(R.id.buGetAge)
        buGetAge.setOnClickListener { buUserAgeClick()}

    }
    fun buUserAgeClick(){
        val tvShowAge: TextView = findViewById(R.id.tvShowAge)
        val etDOB: TextView = findViewById(R.id.etDOB)
        val currentYear = Integer.parseInt(Calendar.getInstance().get(Calendar.YEAR).toString())
        val userDOB =Integer.parseInt(etDOB.text.toString())
        val result = currentYear - userDOB
        tvShowAge.text = "Your Age is $result Years"
    }
}