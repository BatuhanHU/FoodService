package com.bbm.foodservice.dishes.Beverages.Sparkling;

public class Coke extends Sparkling{
    public Coke(){
        super.setName("Coke");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Coke");
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
