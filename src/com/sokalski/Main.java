package com.sokalski;

public class Main {
    public static void main(String[] args) {
        Burger burger = new Burger("white bread", "beef", 4.35);
        burger.setName("Hamburger");
        burger.selectAddition1("cheese", 0.5);
        System.out.println("Total price: $" + burger.putAPriceOnBurger() + "\n");

        HealthyBurger healthyBurger = new HealthyBurger("wheat", "plant based", 4.05);
        healthyBurger.setName("Plant based burger");
        healthyBurger.selectAddition1("tomato", 0.2);
        healthyBurger.selectHealthyAddition1("lettuce", 0.15);
        healthyBurger.selectHealthyAddition2("carrot", 0.20);
        System.out.println("Total price: $" + healthyBurger.putAPriceOnBurger() + "\n");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.setName("Deluxe");
        System.out.println("Total price: $" + deluxeBurger.putAPriceOnBurger());
        deluxeBurger.selectAddition1("chicken", 52.0);
        deluxeBurger.selectAddition2("chicken", 52.0);
        deluxeBurger.selectAddition3("chicken", 52.0);
        deluxeBurger.selectAddition4("chicken", 52.0);


    }
}
