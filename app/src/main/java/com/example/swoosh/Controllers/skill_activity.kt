package com.example.swoosh.Controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.Models.Playes
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class skill_activity : AppCompatActivity() {
    lateinit var player:Playes
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        player= intent.getParcelableExtra(EXTRA_PLAYER)!!
        setContentView(R.layout.activity_skill)
    }
    fun beginClick(view:View)
    {
       ballBtn.isChecked=false
        player.skill="beginner"
    }
    fun ballClick(view: View)
    {
       beginBtn.isChecked=false
        player.skill="baller"
    }
    fun finishClick(view: View)
    {
        if(player.skill!="")
        {
            val finalInt=Intent(this,final_activity::class.java)
            finalInt.putExtra(EXTRA_PLAYER,player)
            startActivity(finalInt)
        }
        else
        {
            Toast.makeText(this,"Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }

}