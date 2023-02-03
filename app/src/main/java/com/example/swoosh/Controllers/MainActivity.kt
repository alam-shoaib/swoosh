package com.example.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Log_activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getBttn.setOnClickListener()
        {
            val leaugeIntent= Intent(this, leaugeActivity::class.java)
            startActivity(leaugeIntent)

        }
        }

    }
