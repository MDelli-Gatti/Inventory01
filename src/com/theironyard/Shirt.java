package com.theironyard;

/**
 * Created by michaeldelli-gatti on 5/24/16.
 */
public class Shirt extends InventoryItem {

    public Shirt(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.category = "Shirt";
    }
}
