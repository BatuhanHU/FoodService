package com.bbm.foodservice.dishes.Warmups;

public class Yayla extends Warmups{
    public Yayla(){
        super.setName("Yayla Corbasi");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Yogurt");
        super.setIngredients("Nane");
        super.setIngredients("Pirinc");
    }

    @Override
    public void cookTime() {
        super.setTime(15);
    }

    @Override
    public void calculateCost() {
        super.setCost(11);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
