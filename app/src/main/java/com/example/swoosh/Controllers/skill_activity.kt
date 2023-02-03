package com.example.swoosh.Controllers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_LEAUGE
import com.example.swoosh.EXTRA_SKILL
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class skill_activity : AppCompatActivity() {
    var leauge=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        leauge= intent.getStringExtra(EXTRA_LEAUGE).toString()
        println(leauge)
        setContentView(R.layout.activity_skill)
    }
    fun beginClick(view:View)
    {
       ballBtn.isChecked=false
        skill="beginner"
    }
    fun ballClick(view: View)
    {
       beginBtn.isChecked=false
        skill="baller"
    }
    fun finishClick(view: View)
    {
        if(skill!="")
        {
            val finalInt=Intent(this,final_activity::class.java)
            finalInt.putExtra(EXTRA_LEAUGE,leauge)
            finalInt.putExtra(EXTRA_SKILL,skill)
            startActivity(finalInt)
        }
        else
        {
            Toast.makeText(this,"Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }

}