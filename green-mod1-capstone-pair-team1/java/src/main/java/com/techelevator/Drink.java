package com.techelevator;

public class Drink extends Item{

    public Drink(String location, String name, String price){
        super(location, name, price);

    }

    @Override
    public void vend() {
        super.vend();
        System.out.println("Glug Glug, Yum!");
    }
}
