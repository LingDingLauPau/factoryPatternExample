package com.kea;

public class Main {

    public static void main(String[] args) {
	// Create an ItemFactory instance

    ItemFactory itemFactory = new ItemFactory();
    //create an object of Aloe Vera and call its addToCart method.
    Item item1 = itemFactory.getItem("ALOE VERA");
    item1.addToCard();

    //create an object of Mango and call its addToCart method.
    Item item2 = itemFactory.getItem("Mango");
    item2.addToCard();

    //create an object of Toothpaste and call its addToCart method.
    Item item3 = itemFactory.getItem("TOoTHpASTE");
    item3.addToCard();

    }
}
