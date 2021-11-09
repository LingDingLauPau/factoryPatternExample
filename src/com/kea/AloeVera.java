package com.kea;

public class AloeVera implements Item {

    private String name = "Aloe Vera";

    private int price = 45;

    @Override
    public void addToCart() {

        System.out.println("The item " + name + " was added to the cart, with the cost of: " + price + ",- DKK");

    }
}
