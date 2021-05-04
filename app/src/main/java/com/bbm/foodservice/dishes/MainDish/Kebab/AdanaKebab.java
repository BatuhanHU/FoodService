package com.bbm.foodservice.dishes.MainDish.Kebab;

public class AdanaKebab extends Kebab{
    public AdanaKebab(){
        super.setName("Adana Kebab");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kiyma");
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
