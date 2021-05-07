package com.bbm.foodservice.dishes.Salads;

public class Coban extends Salads{

    public Coban(){
        super.setName("Coban Salad");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Domates");
        super.setIngredients("Marul");
        super.setIngredients("Salatalık");
        super.setIngredients("Sogan");
        super.setIngredients("Limon");
    }

    @Override
    public void cookTime() {
        super.setTime(10);
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
