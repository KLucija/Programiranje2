package com.lucija.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chines", "Hamuburger", "Pizza", "Mc Donalds", "Zelenjavno")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide_button.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodtext.text = foodList[randomFood]
        }
        AddFoodButton.setOnClickListener {
            val newFood = addFoodtext.text.toString()
            foodList.add(newFood)
            addFoodtext.text.clear()

        }
        }
    }
