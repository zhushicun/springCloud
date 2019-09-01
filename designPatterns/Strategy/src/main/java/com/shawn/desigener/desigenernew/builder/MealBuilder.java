package com.shawn.desigener.desigenernew.builder;

public class MealBuilder {
    public static Meal praperMeal(){
        Item vegMeal =new VerBurger();
        Item coffeeMeal = new Coffee();
        Meal meal = new Meal();
        meal.addItem(vegMeal);
        meal.addItem(coffeeMeal);
        return meal;
    }

    public static Meal praperNoneMeal(){
        Item chenickburger =new ChenickBurger();
        Item milk = new Milk();
        Meal meal = new Meal();
        meal.addItem(chenickburger);
        meal.addItem(milk);
        return meal;
    }
}
