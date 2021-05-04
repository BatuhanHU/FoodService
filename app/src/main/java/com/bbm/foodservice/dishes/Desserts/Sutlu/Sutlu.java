package com.bbm.foodservice.dishes.Desserts.Sutlu;

import com.bbm.foodservice.dishes.Desserts.Desserts;

abstract public class Sutlu extends Desserts {
    public static Sutlu returnDish(String type){
        if(type.equalsIgnoreCase("gullac")){
            return new Gullac();
        }else if(type.equalsIgnoreCase("muhallebi")){
            return new Muhallebi();
        }else if(type.equalsIgnoreCase("sutlac")){
            return new Sutlac();
        } else if(type.equalsIgnoreCase("tiramisu")){
            return new Tiramisu();
        }
        return null;
    }
}
