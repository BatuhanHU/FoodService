package com.bbm.foodservice.dishes.MainDish.Pide;

import com.bbm.foodservice.dishes.MainDish.MainDish;

abstract public class Pide extends MainDish {

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
