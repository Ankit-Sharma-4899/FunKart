package com.example.funkart

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var layouts:ArrayList<Int>
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager2:ViewPager2
    private lateinit var layoutdots:LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    @SuppressLint("WrongViewCast")
    private fun init() {
        layouts= arrayListOf(
            R.layout.activity_main,
            R.layout.onboarding1,
            R.layout.onboarding2,
            R.layout.onboarding3,
        )
        layoutdots=findViewById(R.id.btnLogin)
        viewPager2=findViewById(R.id.signup)
        viewPagerAdapter= ViewPagerAdapter(this,layouts)
        viewPager2.adapter=viewPagerAdapter
        //viewPager2.registerOnPageChangeCallback()

        val btnSkip:Button=findViewById(R.id.btnLogin)
        btnSkip.setOnClickListener {

        }
        val btnNext:Button=findViewById(R.id.signup)
        btnNext.setOnClickListener {
            var current=getItem(+1)
            if(current < layouts.size){
                viewPager2.currentItem = current
            }
        }
    }


    private fun getItem(position:Int):Int{
        return viewPager2.currentItem + position
    }
}