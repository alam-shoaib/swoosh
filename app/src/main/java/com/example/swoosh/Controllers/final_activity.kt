package com.example.swoosh.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.Models.Playes
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_final.*
import kotlinx.android.synthetic.main.activity_leauge.*

class final_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val player=intent.getParcelableExtra<Playes>(EXTRA_PLAYER)
        setContentView(R.layout.activity_final)
        if (player != null) {
            finalTxt.text="Looking for a ${player.leauge} ${player.skill} leauge near you ..."
        }
    }

}