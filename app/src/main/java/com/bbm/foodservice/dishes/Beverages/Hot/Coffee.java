package com.bbm.foodservice.dishes.Beverages.Hot;

public class Coffee extends Hot{
    public Coffee(){
        super.setName("Coffee");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Coffee");
        super.setIngredients("Water");
    }

    @Override
    public void cookTime() {
        super.setTime(7);
    }

    @Override
    public void calculateCost() {
        super.setCost(6);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
