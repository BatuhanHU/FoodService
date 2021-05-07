package com.bbm.foodservice.dishes.MainDish.Sisler;

import java.util.ArrayList;

public class Kuzu extends Sis{

    public Kuzu(){
        super.setName("kuzu sis");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kuzu eti");
    }

    @Override
    public void cookTime() {
        super.setTime(35);
    }

    @Override
    public void calculateCost() {
        super.setCost(40);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
