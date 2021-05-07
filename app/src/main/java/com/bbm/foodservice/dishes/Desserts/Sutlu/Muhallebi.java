package com.bbm.foodservice.dishes.Desserts.Sutlu;

public class Muhallebi extends Sutlu{
    public Muhallebi(){
        super.setName("Muhallebi");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Bugday nisastasi");
        super.setIngredients("Sut");
        super.setIngredients("Seker");
        super.setIngredients("Tereyag");
        super.setIngredients("Un");
    }

    @Override
    public void cookTime() {
        super.setTime(20);
    }

    @Override
    public void calculateCost() {
        super.setCost(13);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
