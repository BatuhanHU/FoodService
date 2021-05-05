package com.bbm.foodservice.dishes.MainDish.Kebab;

import com.bbm.foodservice.dishes.MainDish.MainDish;

abstract public class Kebab extends MainDish {

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



    public static Kebab returnDish(String type){
        if(type.equalsIgnoreCase("adana")){
            return new AdanaKebab();
        }else if(type.equalsIgnoreCase("ali nazik")){
            return new AliNazikKebab();
        }else if(type.equalsIgnoreCase("karisik")){
            return new KarisikKebab();
        } else if(type.equalsIgnoreCase("patlican")){
            return new PatlicanKebab();
        } else if(type.equalsIgnoreCase("urfa")){
            return new UrfaKebab();
        }else if(type.equalsIgnoreCase("yogurtlu")){
            return new YogurtluKebab();
        }
        return null;
    }
}
