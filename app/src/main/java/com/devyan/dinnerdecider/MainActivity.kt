package com.devyan.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var foods = mutableListOf<String>("Chinese")

        addFoodBtn.setOnClickListener{
            if (addFoodTxt.text.isNotEmpty()) {
                foods.add(addFoodTxt.text.toString())
                addFoodTxt.text.clear()
            }else{
                selectedFoodText.text = "Insert a valid food name"
            }
        }

        decideBtn.setOnClickListener{
            if (foods.size == 0){
                selectedFoodText.text = "Add a food to decide"
            }else{
                selectedFoodText.text = foods[java.util.Random().nextInt(foods.size)]
            }

        }
    }
}
