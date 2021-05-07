package com.bbm.foodservice.dishes.MainDish;

import com.bbm.foodservice.dishes.Desserts.Serbetli.Serbetli;
import com.bbm.foodservice.dishes.Desserts.Sutlu.Sutlu;
import com.bbm.foodservice.dishes.MainDish.Izgara.Izgara;
import com.bbm.foodservice.dishes.MainDish.Kebab.Kebab;
import com.bbm.foodservice.dishes.MainDish.Pide.Pide;
import com.bbm.foodservice.dishes.MainDish.Sisler.Sis;
import com.bbm.foodservice.dishes.Order;

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

abstract public class MainDish extends Order {

    private String name;
    private int time;
    private double cost;
    private boolean preparing;
    private ArrayList<String> ingredients = new ArrayList<>();

    public static MainDish chooseDish(String mainDishType, String type){
        if(mainDishType.equalsIgnoreCase("izgara")){
            return Izgara.returnDish(type);
        }else if(mainDishType.equalsIgnoreCase("kebab")){
            return Kebab.returnDish(type);
        }else if(mainDishType.equalsIgnoreCase("pide")){
            return Pide.returnDish(type);
        }else if(mainDishType.equalsIgnoreCase("sis")){
            return Sis.returnDish(type);
        }

        return null;
    }
/*
    //steps
    public abstract void addIngredients();
    public abstract void cookTime();
    public abstract void calculateCost();
    public abstract void prepareToServe();
*/

    public abstract void prepareMainDish();

    //template method
    public void prepareFood(){
        /*
        addIngredients();
        cookTime();
        calculateCost();
        prepareToServe();

         */
        prepareMainDish();
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public boolean getPreparing() {
        return preparing;
    }

    public void setPreparing(boolean preparing) {
        this.preparing = preparing;
    }

}
