package com.sokalski;

// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.

public class Burger {
    private String name;
    private String breadType;
    private String meat;
    private double price;

    private String addition1Type;
    private double priceAdd1;

    private String addition2Type;
    private double priceAdd2;

    private String addition3Type;
    private double priceAdd3;

    private String addition4Type;
    private double priceAdd4;

    public Burger(String breadType, String meat, double price) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectAddition1(String name, double price) {
        this.addition1Type = name;
        this.priceAdd1 = price;
    }

    public void selectAddition2(String name, double price) {
        this.addition2Type = name;
        this.priceAdd2 = price;
    }

    public void selectAddition3(String name, double price) {
        this.addition3Type = name;
        this.priceAdd3 = price;
    }

    public void selectAddition4(String name, double price) {
        this.addition4Type = name;
        this.priceAdd4 = price;
    }

    public double putAPriceOnBurger() {
        double burgerPrice = this.price;
        System.out.println("Now serving " + this.name + " on a " + this.breadType + " roll with." + this.meat + "meat. \n" +
                "Price is $" + burgerPrice);
        if(this.addition1Type != null) {
            burgerPrice += priceAdd1;
            System.out.println("Added " + addition1Type + " for $" + priceAdd1);
        }
        if(this.addition2Type != null) {
            burgerPrice += priceAdd2;
            System.out.println("Added " + addition2Type + " for $" + priceAdd2);
        }
        if(this.addition3Type != null) {
            burgerPrice += priceAdd3;
            System.out.println("Added " + addition3Type + " for $" + priceAdd3);
        }
        if(this.addition4Type != null) {
            burgerPrice += priceAdd4;
            System.out.println("Added " + addition4Type + " for $" + priceAdd4);
        }

        return burgerPrice;
    }
}
