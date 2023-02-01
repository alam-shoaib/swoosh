package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class leaugeActivity : Log_activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)
    }
    fun nextClick(view:View)
    {
        val nextpage= Intent(this,skill_activity::class.java)
        startActivity(nextpage)
    }
}