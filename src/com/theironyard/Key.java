package com.theironyard;

/**
 * Created by michaeldelli-gatti on 5/24/16.
 */
public class Key extends InventoryItem {

    public Key(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.category = "Key";
    }
}
