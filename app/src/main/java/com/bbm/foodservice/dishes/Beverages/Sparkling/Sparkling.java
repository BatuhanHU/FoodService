package com.bbm.foodservice.dishes.Beverages.Sparkling;

import com.bbm.foodservice.dishes.Beverages.Beverages;

abstract public class Sparkling extends Beverages {
    public static Sparkling returnDish(String type){
        if(type.equalsIgnoreCase("coke")){
            return new Coke();
        }else if(type.equalsIgnoreCase("sprite")){
            return new Sprite();
        }else if(type.equalsIgnoreCase("sparkling water")){
            return new SparklingWater();
        }
        return null;
    }
}
