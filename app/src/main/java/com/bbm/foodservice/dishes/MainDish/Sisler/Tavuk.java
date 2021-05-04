package com.bbm.foodservice.dishes.MainDish.Sisler;

public class Tavuk extends Sis{

    public Tavuk(){
        super.setName("tavuk sis");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Tavuk eti");
    }

    @Override
    public void cookTime() {
        super.setTime(25);
    }

    @Override
    public void calculateCost() {
        super.setCost(30);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
