package com.jade.rohank.dinnerdash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodList = arrayOf("Om's Dosa", "Rao's Chaap", "Paneer Lababdaar", "Pizza Hut", "Burger King", "McDonald's")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dashButton.setOnClickListener {
            val rand = Random()
            val randFood = rand.nextInt(foodList.size)
            decidedFood.setText(foodList[randFood])
        }

    }
}
