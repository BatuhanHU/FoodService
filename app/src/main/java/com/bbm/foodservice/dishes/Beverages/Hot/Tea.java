package com.bbm.foodservice.dishes.Beverages.Hot;

public class Tea extends Hot{
    public Tea(){
        super.setName("Tea");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Tea");
        super.setIngredients("Water");
    }

    @Override
    public void cookTime() {
        super.setTime(7);
    }

    @Override
    public void calculateCost() {
        super.setCost(3);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
