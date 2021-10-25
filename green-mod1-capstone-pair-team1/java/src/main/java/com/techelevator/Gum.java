package com.techelevator;

public class Gum extends Item{

    public Gum(String location, String name, String price){
        super(location, name, price);
    }

    @Override
    public void vend() {
        super.vend();
        System.out.println("Chew Chew, Yum!");
    }
}
