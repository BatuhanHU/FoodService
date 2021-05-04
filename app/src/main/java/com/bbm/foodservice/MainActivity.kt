package com.bbm.foodservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bbm.foodservice.dishes.MainDish.Pide.Kiymali

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var kiymali: Kiymali = Kiymali()
        kiymali.addIngredients("Hamur")
        Log.d("ali",kiymali.ingredients.toString())

        var helloworld= findViewById<TextView>(R.id.textView)
        helloworld.text = "Batu Hello"
    }
}