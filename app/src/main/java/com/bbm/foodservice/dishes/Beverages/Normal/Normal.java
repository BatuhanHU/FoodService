package com.bbm.foodservice.dishes.Beverages.Normal;

import com.bbm.foodservice.dishes.Beverages.Beverages;

abstract public class Normal extends Beverages {

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

    public static Normal returnDish(String type){
        if(type.equalsIgnoreCase("ayran")){
            return new Ayran();
        }else if(type.equalsIgnoreCase("water")){
            return new Water();
        }
        return null;
    }
}
