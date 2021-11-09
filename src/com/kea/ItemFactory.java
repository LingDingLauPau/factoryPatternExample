package com.kea;


public class ItemFactory {

    public Item getItem(String itemType){
        if (itemType == null){
            return null;
        }
        if (itemType.equalsIgnoreCase("MANGO")){
            return new Mango();
        }
        if (itemType.equalsIgnoreCase("ALOE VERA")){
            return new AloeVera();
        }
        if (itemType.equalsIgnoreCase("TOOTHPASTE")){
            return new Toothpaste();
        }
        return null;
    }
}
