package com.theironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<InventoryItem> items = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static InventoryItem createItem(String item, int quantity, String category){
        switch(category) {
            case "Key":
                return new Key(item, quantity);
            case "Laptop":
                return new Laptop(item, quantity);
            case "Shirt":
                return new Shirt(item, quantity);
            case "Shoe":
                return new Shoe(item, quantity);
            case "Apple":
                return new Apple(item, quantity);
        }

       return createItem(item, quantity, category);

    }
    public static void addItem(){
        System.out.println("Enter your new item.");
        String item = Main.scanner.nextLine();
        System.out.println("Enter the quantity.");
        String quantityStr = Main.scanner.nextLine();
        int quantity = Integer.valueOf(quantityStr);
        System.out.println("Enter the category.");
        String category = scanner.nextLine();
        InventoryItem inv = createItem(item, quantity, category);
        items.add(inv);
    }
    public static void removeItem(){
        System.out.println("Which item number would you like to remove?");
        String remove = Main.scanner.nextLine();
        int num = Integer.valueOf(remove);
        InventoryItem tempItem = items.get(num - 1);
        items.remove(tempItem);
    }

    public static void updateQuantity() {
        System.out.println("Which item number would you like to update?");
        String itemU = Main.scanner.nextLine();
        int numb = Integer.valueOf(itemU);
        InventoryItem tempItem1 = items.get(numb - 1);
        System.out.printf("What is the new quantity of %s?\n", itemU);
        String quan = Main.scanner.nextLine();
        tempItem1.quantity = Integer.valueOf(quan);
    }

    public static void main(String[] args) {



        while (true) {
            int i = 1;
            for (InventoryItem inventoryItem : items) {
                System.out.printf("%s. [%s] %s %s\n", i, inventoryItem.quantity, inventoryItem.item, inventoryItem.category);
                i = i + 1;
            }
            System.out.println("Options:");
            System.out.println("1. Create a new item");
            System.out.println("2. Remove an item");
            System.out.println("3. Update an item's quantity");

            String selection = Main.scanner.nextLine();

            switch (selection){
                case"1":
                    addItem();
                    break;
                case "2":
                    removeItem();
                    break;
                case "3":
                    updateQuantity();
                    break;
                default:
                    System.out.println("invalid selection");
            }

        }
    }
}
