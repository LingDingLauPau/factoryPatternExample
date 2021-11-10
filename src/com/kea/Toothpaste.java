package com.kea;

public class Toothpaste implements com.kea.Item {

    private String name = "Toothpaste";

    private int price = 20;

    @Override
    public void addToCart() {

        System.out.println("The item " + name + " was added to" +
                " the cart, with the cost of: " + price + ",- DKK");

    }
}
