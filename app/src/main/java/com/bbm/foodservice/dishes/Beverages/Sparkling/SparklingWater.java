package com.bbm.foodservice.dishes.Beverages.Sparkling;

public class SparklingWater extends Sparkling{
    public SparklingWater(){
        super.setName("Sparkling Water");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Sparkling Water");
    }

    @Override
    public void cookTime() {
        super.setTime(1);
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
