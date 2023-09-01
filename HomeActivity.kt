package com.example.setalarm

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.util.Calendar

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val setalarminhome = findViewById<Button>(R.id.setalarmbutton_inhome)

        val calendar = Calendar.getInstance().time
        val showdate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar)
        val showtime = DateFormat.getTimeInstance().format(calendar)


        val timeview = findViewById<TextView>(R.id.showing_timeinhome)
        val dateview = findViewById<TextView>(R.id.showing_dateinhome)

        timeview.text = showtime
        dateview.text= showdate


        setalarminhome.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}