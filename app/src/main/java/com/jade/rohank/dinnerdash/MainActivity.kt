package com.jade.rohank.dinnerdash

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    var foodList = arrayListOf("Om's Dosa", "Rao's Chaap", "Paneer Lababdaar", "Pizza Hut", "Burger King", "McDonald's")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dashButton.setOnClickListener {
            val rand = Random()
            val randFood = rand.nextInt(foodList.size)
            decidedFood.text = foodList[randFood]
        }

        floatingAddFood.setOnClickListener {
            val newItem = addFoodFld.text.toString().trim()
            if (newItem == ""){
                Toast.makeText(this, "Are you from Q/A team ? \uD83D\uDE3C", Toast.LENGTH_SHORT).show()
                addFoodFld.text.clear()
            } else {
                foodList.add(newItem)
                Toast.makeText(this, "Added item `$newItem` to list! ", Toast.LENGTH_SHORT).show()
                addFoodFld.text.clear()
            }
        }
    }
}
