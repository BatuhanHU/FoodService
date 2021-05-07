package com.bbm.foodservice.dishes.Beverages.Sparkling;

public class Sprite extends Sparkling{
    public Sprite(){
        super.setName("Sprite");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Sprite");
    }

    @Override
    public void cookTime() {
        super.setTime(1);
    }

    @Override
    public void calculateCost() {
        super.setCost(5);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
