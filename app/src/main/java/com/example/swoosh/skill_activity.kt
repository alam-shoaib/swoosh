package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class skill_activity : AppCompatActivity() {
    var leauge=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        leauge= intent.getStringExtra(EXTRA_LEAUGE).toString()
        println(leauge)
        setContentView(R.layout.activity_skill)
    }
}