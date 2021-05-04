package com.bbm.foodservice.dishes.Beverages.Normal;

import com.bbm.foodservice.dishes.Beverages.Beverages;

abstract public class Normal extends Beverages {
    public static Normal returnDish(String type){
        if(type.equalsIgnoreCase("ayran")){
            return new Ayran();
        }else if(type.equalsIgnoreCase("water")){
            return new Water();
        }
        return null;
    }
}
