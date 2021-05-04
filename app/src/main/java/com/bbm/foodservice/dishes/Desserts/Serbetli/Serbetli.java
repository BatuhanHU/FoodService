package com.bbm.foodservice.dishes.Desserts.Serbetli;

import com.bbm.foodservice.dishes.Desserts.Desserts;

abstract public class Serbetli extends Desserts{
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
