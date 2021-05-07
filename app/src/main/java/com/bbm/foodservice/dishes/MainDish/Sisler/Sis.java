package com.bbm.foodservice.dishes.MainDish.Sisler;

import com.bbm.foodservice.dishes.MainDish.MainDish;

import java.util.ArrayList;

abstract public class Sis extends MainDish{

    @Override
    public void prepareMainDish(){
        addIngredients();
        cookTime();
        calculateCost();
        prepareToServe();
    }

    public abstract void addIngredients();
    public abstract void cookTime();
    public abstract void calculateCost();
    public abstract void prepareToServe();

    public static Sis returnDish(String type){
        if(type.equalsIgnoreCase("kuzu")){
            return new Kuzu();
        }else if(type.equalsIgnoreCase("cop")){
            return new Cop();
        }else if(type.equalsIgnoreCase("tavuk")){
            return new Tavuk();
        }
        return null;
    }

}
