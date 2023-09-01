package com.example.setalarm

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class BroadcastReceiverActivity : BroadcastReceiver () {
    override fun onReceive(p0: Context?, p1: Intent?) {

        val intent = Intent(p0, AlarmTimeActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        p0?.startActivity(intent)
    }
}