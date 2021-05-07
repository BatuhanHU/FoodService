package com.bbm.foodservice.dishes.MainDish.Kebab;

public class PatlicanKebab extends Kebab{
    public PatlicanKebab(){
        super.setName("Patlican Kebab");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Patlican");
        super.setIngredients("Kiyma");
        super.setIngredients("Domates");
    }

    @Override
    public void cookTime() {
        super.setTime(35);
    }

    @Override
    public void calculateCost() {
        super.setCost(55);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
