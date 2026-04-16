package com.luv2code.java_design_pattern.creational.Builder;

public class MainApp {
    public static void main(String[] args){
        // Create a meal with required burger and optional drink
        Meal meal1 = new Meal.Builder(Burger.HAMBURGER)
                .drink(Drink.COKE)
                .build();

        System.out.println(meal1);

        // Create a meal with only the required burger, optional drink and fries
        Meal meal2 = new Meal.Builder(Burger.VEG)
                .drink(Drink.LEMONADE)
                .fries(Fries.FRENCH_FRIES)
                .build();

        System.out.println(meal2);
    }
}
