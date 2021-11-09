package com.kea;

public class Mango implements Item {

    private String name = "Mango";

    private int price = 25;

    @Override
    public void addToCard() {

        System.out.println("The item " + name + " was added to the cart, with the cost of: " + price + ",- DKK");

    }

}
