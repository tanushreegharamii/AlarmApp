package com.example.setalarm

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import java.text.DateFormat
import java.util.Calendar


class MainActivity : AppCompatActivity() {
    @SuppressLint("UnspecifiedImmutableFlag", "MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val setalarmbutton = findViewById<Button>(R.id.button1)
        val setSec = findViewById<EditText>(R.id.editTextNumber)
        val bactohme = findViewById<CardView>(R.id.backtohome)

        val calendar = Calendar.getInstance().time
        val showdate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar)
        val showtime = DateFormat.getTimeInstance().format(calendar)


        val timeview = findViewById<TextView>(R.id.showing_time)
        val dateview = findViewById<TextView>(R.id.showingdate)

        timeview.text = showtime
        dateview.text= showdate



        setalarmbutton.setOnClickListener{
            val setSecond = setSec.text.toString().toInt()
            val intent = Intent(applicationContext, BroadcastReceiverActivity::class.java)
            val pendingintent = PendingIntent.getBroadcast(applicationContext,111,intent,0)
            val alarmmngr: AlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmmngr.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(setSecond*1000),pendingintent)
            Toast.makeText(applicationContext, "Alarm after has been set successfully !", Toast.LENGTH_LONG).show()

            }



        bactohme.setOnClickListener {
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
            }


        }

    }



