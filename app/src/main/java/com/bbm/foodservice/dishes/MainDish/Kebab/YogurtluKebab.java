package com.bbm.foodservice.dishes.MainDish.Kebab;

public class YogurtluKebab extends Kebab{
    public YogurtluKebab(){
        super.setName("Yogurtlu Kebab");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kiyma");
        super.setIngredients("Yogurt");
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
