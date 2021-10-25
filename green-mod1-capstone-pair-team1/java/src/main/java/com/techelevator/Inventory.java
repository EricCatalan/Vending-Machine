package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {

    private static final int LOCATION = 0;
    private static final int NAME = 1;
    private static final int PRICE = 2;
    private static final int TYPE = 3;

public TreeMap <String, Item> makeInventory() {

    File inventoryFile = new File("vendingmachine.csv");



        TreeMap<String,Item> inventory = new TreeMap<String, Item>();

        try (Scanner fileScanner = new Scanner(inventoryFile)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] itemDetails = line.split("\\|");

                if (itemDetails[TYPE].equals("Candy")) {
                    Candy candy = new Candy(itemDetails[LOCATION], itemDetails[NAME], itemDetails[PRICE]);
                    inventory.put(itemDetails[LOCATION], candy);
                }

                if (itemDetails[TYPE].equals("Chip")) {
                    Chip chip = new Chip(itemDetails[LOCATION], itemDetails[NAME], itemDetails[PRICE]);
                    inventory.put(itemDetails[LOCATION], chip);
                }

                if (itemDetails[TYPE].equals("Drink")) {
                    Drink drink = new Drink(itemDetails[LOCATION], itemDetails[NAME], itemDetails[PRICE]);
                    inventory.put(itemDetails[LOCATION], drink);
                }

                if (itemDetails[TYPE].equals("Gum")) {
                    Gum gum = new Gum(itemDetails[LOCATION], itemDetails[NAME], itemDetails[PRICE]);
                    inventory.put(itemDetails[LOCATION], gum);
                }

            }
        }
        catch (Exception e) {
            System.out.println("Error occurred");
        }
        return inventory;
    }
}