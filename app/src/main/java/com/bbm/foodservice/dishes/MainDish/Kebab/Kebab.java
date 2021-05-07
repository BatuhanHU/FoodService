package com.bbm.foodservice.dishes.MainDish.Kebab;

import com.bbm.foodservice.dishes.MainDish.MainDish;

abstract public class Kebab extends MainDish {
    public static Kebab returnDish(String type){
        if(type.equalsIgnoreCase("adana kebab")){
            return new AdanaKebab();
        }else if(type.equalsIgnoreCase("ali nazik kebab")){
            return new AliNazikKebab();
        }else if(type.equalsIgnoreCase("karisik kebab")){
            return new KarisikKebab();
        } else if(type.equalsIgnoreCase("patlican kebab")){
            return new PatlicanKebab();
        } else if(type.equalsIgnoreCase("urfa kebab")){
            return new UrfaKebab();
        }else if(type.equalsIgnoreCase("yogurtlu kebab")){
            return new YogurtluKebab();
        }
        return null;
    }
}
