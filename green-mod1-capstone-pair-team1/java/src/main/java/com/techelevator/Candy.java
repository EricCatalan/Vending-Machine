package com.techelevator;

public class Candy extends Item{

    public Candy(String location, String name, String price){
        super(location, name, price);
    }

    @Override
    public void vend() {
        super.vend();
        System.out.println("Munch Munch, Yum!");
    }
}
