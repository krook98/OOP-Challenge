package com.sokalski;

// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).

public class HealthyBurger extends Burger {
    private String healthyAddition1;
    private double priceHealthy1;
    private String healthyAddition2;
    private double priceHealthy2;

    public HealthyBurger(String breadType, String meat, double price) {
        super(breadType, meat, price);
    }

    public void selectHealthyAddition1(String name, double price) {
        this.healthyAddition1 = name;
        this.priceHealthy1 = price;
    }

    public void selectHealthyAddition2(String name, double price) {
        this.healthyAddition2 = name;
        this.priceHealthy2 = price;
    }

    @Override
    public double putAPriceOnBurger() {
        double burgerPrice = super.putAPriceOnBurger();
        if(this.healthyAddition1 != null) {
            burgerPrice += priceHealthy1;
            System.out.println("Added " + healthyAddition1 + " for $" + priceHealthy1);
        }
        if(this.healthyAddition2 != null) {
            burgerPrice += priceHealthy2;
            System.out.println("Added " + healthyAddition2 + " for $" + priceHealthy2);
        }

        return burgerPrice;
    }

}
