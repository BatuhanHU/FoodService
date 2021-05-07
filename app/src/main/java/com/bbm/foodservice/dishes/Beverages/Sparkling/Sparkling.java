package com.bbm.foodservice.dishes.Beverages.Sparkling;

import com.bbm.foodservice.dishes.Beverages.Beverages;

abstract public class Sparkling extends Beverages {

    @Override
    public void prepareBeverages(){
        addIngredients();
        cookTime();
        calculateCost();
        prepareToServe();
    }

    public abstract void addIngredients();
    public abstract void cookTime();
    public abstract void calculateCost();
    public abstract void prepareToServe();

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
