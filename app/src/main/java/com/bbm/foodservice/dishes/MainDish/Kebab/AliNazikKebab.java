package com.bbm.foodservice.dishes.MainDish.Kebab;

public class AliNazikKebab extends Kebab{
    public AliNazikKebab(){
        super.setName("Ali Nazik Kebab");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Kusbasi");
        super.setIngredients("Yogurt");
        super.setIngredients("Patlican");
        super.setIngredients("Sarımsak");
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
