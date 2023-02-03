package com.example.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_PLAYER
import com.example.swoosh.Models.Playes
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_leauge.*

class leaugeActivity : Log_activity() {
    var playes=Playes("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)
    }
    fun menClick(view: View)
    {
        womenBtn.isChecked=false
        coedBtn.isChecked=false
        playes.leauge="mens"
    }
    fun womenClick(view: View)
    {
        menBtn.isChecked=false
        coedBtn.isChecked=false
        playes.leauge="women"
    }
    fun coedClick(view: View)
    {
        menBtn.isChecked=false
        womenBtn.isChecked=false
        playes.leauge="coed"
    }
    fun nextClick(view:View)
    {
        if(playes.leauge!="") {
            val nextpage = Intent(this, skill_activity::class.java)
            nextpage.putExtra(EXTRA_PLAYER,playes)
            startActivity(nextpage)
        }
        else
        {
            Toast.makeText(this,"select any of the above leauge",Toast.LENGTH_SHORT).show()
        }
    }
}