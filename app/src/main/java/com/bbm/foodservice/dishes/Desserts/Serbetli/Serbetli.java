package com.bbm.foodservice.dishes.Desserts.Serbetli;

import com.bbm.foodservice.dishes.Desserts.Desserts;

abstract public class Serbetli extends Desserts{

    @Override
    public void prepareDessert(){
        addIngredients();
        cookTime();
        calculateCost();
        prepareToServe();
    }

    public abstract void addIngredients();
    public abstract void cookTime();
    public abstract void calculateCost();
    public abstract void prepareToServe();


    public static Serbetli returnDish(String type){
        if(type.equalsIgnoreCase("baklava")){
            return new Baklava();
        }else if(type.equalsIgnoreCase("halka")){
            return new Halka();
        }else if(type.equalsIgnoreCase("kunefe")){
            return new Kunefe();
        } else if(type.equalsIgnoreCase("revani")){
            return new Revani();
        }
        return null;
    }
}
