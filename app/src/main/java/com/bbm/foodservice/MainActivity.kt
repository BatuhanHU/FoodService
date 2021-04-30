package com.bbm.foodservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bbm.foodservice.dishes.MainDish.Kiymali

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kiymali: Kiymali = Kiymali();
        kiymali.addIngredients("Hamur");
        Log.d("ali",kiymali.ingredients.toString())
    }


}