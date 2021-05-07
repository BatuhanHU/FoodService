package com.bbm.foodservice.dishes.MainDish.Pide;

public class Kusbasili extends Pide{

    public Kusbasili(){
        super.setName("Kusbasili pide");
    }

    @Override
    public void addIngredients(){
        super.setIngredients("Kusbasi");
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
