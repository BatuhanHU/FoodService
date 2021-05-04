package com.bbm.foodservice.dishes.MainDish.Pide;

public class Kasarli extends Pide {

    public Kasarli(){
        super.setName("Kasarli pide");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kasar");
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
