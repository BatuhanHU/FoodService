package com.bbm.foodservice.dishes.MainDish.Kebab;

public class UrfaKebab extends Kebab{
    public UrfaKebab(){
        super.setName("Urfa Kebab");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kuzu Kiyma");
        super.setIngredients("Sogan");
    }

    @Override
    public void cookTime() {
        super.setTime(30);
    }

    @Override
    public void calculateCost() {
        super.setCost(45);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
