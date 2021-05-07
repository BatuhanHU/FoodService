package com.bbm.foodservice.dishes.MainDish.Pide;

import com.bbm.foodservice.dishes.MainDish.MainDish;

abstract public class Pide extends MainDish {

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


    public static Pide returnDish(String type){
        if(type.equalsIgnoreCase("kasarli")){
            return new Kasarli();
        }else if(type.equalsIgnoreCase("kiymali")){
            return new Kiymali();
        }else if(type.equalsIgnoreCase("kusbasili")){
            return new Kusbasili();
        }
        return null;
    }
}
