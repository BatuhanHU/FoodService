package com.bbm.foodservice.dishes.MainDish.Kebab;

public class KarisikKebab extends Kebab{
    public KarisikKebab(){
        super.setName("Karisik Kebab");
    }

    @Override
    public void addIngredients() {
        super.setIngredients("Tavuk");
        super.setIngredients("Kiyma");
        super.setIngredients("Patlican");
    }

    @Override
    public void cookTime() {
        super.setTime(45);
    }

    @Override
    public void calculateCost() {
        super.setCost(115);
    }

    @Override
    public void prepareToServe() {
        super.setPreparing(true);
    }
}
