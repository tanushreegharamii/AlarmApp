package com.example.setalarm

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DateFormat
import java.util.Calendar


class AlarmTimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_time)
        val alarmstops = findViewById<Button>(R.id.stopalarm)
        val mediaplayer = MediaPlayer.create(applicationContext, R.raw.alarm_tone)
        mediaplayer.start()

        alarmstops.setOnClickListener {
            mediaplayer.stop()
            alarmstops.text="Stopped"

            }

        val calendar = Calendar.getInstance().time
        val showtime = DateFormat.getTimeInstance().format(calendar)


        val timeview = findViewById<TextView>(R.id.showtime)
        timeview.text = showtime

        }
    }