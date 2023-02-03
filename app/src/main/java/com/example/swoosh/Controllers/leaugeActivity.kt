package com.example.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.EXTRA_LEAUGE
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_leauge.*

class leaugeActivity : Log_activity() {
    var selectLeauge=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leauge)
    }
    fun menClick(view: View)
    {
        womenBtn.isChecked=false
        coedBtn.isChecked=false
        selectLeauge="mens"
    }
    fun womenClick(view: View)
    {
        menBtn.isChecked=false
        coedBtn.isChecked=false
        selectLeauge="women"
    }
    fun coedClick(view: View)
    {
        menBtn.isChecked=false
        womenBtn.isChecked=false
        selectLeauge="coed"
    }
    fun nextClick(view:View)
    {
        if(selectLeauge!="") {
            val nextpage = Intent(this, skill_activity::class.java)
            nextpage.putExtra(EXTRA_LEAUGE,selectLeauge)
            startActivity(nextpage)
        }
        else
        {
            Toast.makeText(this,"select any of the above leauge",Toast.LENGTH_SHORT).show()
        }
    }
}