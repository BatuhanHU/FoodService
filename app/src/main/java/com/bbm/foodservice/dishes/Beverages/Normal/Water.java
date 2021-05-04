package com.bbm.foodservice.dishes.Beverages.Normal;

public class Water extends Normal{
    public Water(){
        super.setName("Water");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Water");
    }

    @Override
    public void cookTime() {
        super.setTime(1);
    }

    @Override
    public void calculateCost() {
        super.setCost(2);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
