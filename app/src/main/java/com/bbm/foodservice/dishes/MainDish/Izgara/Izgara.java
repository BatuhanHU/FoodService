package com.bbm.foodservice.dishes.MainDish.Izgara;

import com.bbm.foodservice.dishes.MainDish.MainDish;

abstract public class Izgara extends MainDish {

    public static Izgara returnDish(String type){
        if(type.equalsIgnoreCase("kofte")){
            return new Kofte();
        }else if(type.equalsIgnoreCase("tavuk kanat")){
            return new TavukKanat();
        }
        return null;
    }

}
