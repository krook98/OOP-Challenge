package com.sokalski;

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.

public class DeluxeBurger extends Burger{
    public DeluxeBurger() {
        super("White", "brisket", 10.0);
        super.selectAddition1("chips", 2.0);
        super.selectAddition2("drink", 3.0);
    }

    @Override
    public void selectAddition1(String name, double price) {
        System.out.println("Cannot add items to a deluxe burger");;
    }

    @Override
    public void selectAddition2(String name, double price) {
        System.out.println("Cannot add items to a deluxe burger");;
    }

    @Override
    public void selectAddition3(String name, double price) {
        System.out.println("Cannot add items to a deluxe burger");;
    }

    @Override
    public void selectAddition4(String name, double price) {
        System.out.println("Cannot add items to a deluxe burger");;
    }
}