package com.bbm.foodservice.dishes.Salads;

import com.bbm.foodservice.dishes.Order;

import java.util.ArrayList;

abstract public class Salads extends Order {
    private String name;
    private int time;
    private double cost;
    private boolean preparing;
    private ArrayList<String> ingredients = new ArrayList<>();

    public static Salads chooseDish(String dish){
        if(dish.equalsIgnoreCase("coban")){
            return new Coban();
        }else if(dish.equalsIgnoreCase("sogan")){
            return new Sogan();
        } else if(dish.equalsIgnoreCase("saezar")){
            return new Saezar();
        }
        return null;
    }

    //steps
    public abstract void addIngredients();
    public abstract void cookTime();
    public abstract void calculateCost();
    public abstract void prepareToServe();

    //template method
    public void prepareFood(){
        addIngredients();
        cookTime();
        calculateCost();
        prepareToServe();
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
