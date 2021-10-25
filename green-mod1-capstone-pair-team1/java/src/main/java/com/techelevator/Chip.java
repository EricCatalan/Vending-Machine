package com.techelevator;

public class Chip extends Item{

    public Chip(String location, String name, String price){
        super(location, name, price);
    }

    @Override
    public void vend() {
        super.vend();
        System.out.println("Crunch Crunch, Yum!");
    }
}
