package com.theironyard;

/**
 * Created by michaeldelli-gatti on 5/24/16.
 */
public class Laptop extends InventoryItem {

    public Laptop(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.category = "Laptop";
    }
}
