package com.example.swoosh.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.EXTRA_LEAUGE
import com.example.swoosh.EXTRA_SKILL
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_final.*
import kotlinx.android.synthetic.main.activity_leauge.*

class final_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val selectSkill=intent.getStringExtra(EXTRA_SKILL).toString()
        val selectLeauge=intent.getStringExtra(EXTRA_LEAUGE).toString()
        setContentView(R.layout.activity_final)
        finalTxt.text="Looking for a $selectLeauge $selectSkill leauge near you ..."
    }

}