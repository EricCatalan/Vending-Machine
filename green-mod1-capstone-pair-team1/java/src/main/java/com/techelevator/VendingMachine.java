package com.techelevator;

import com.sun.source.tree.Tree;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VendingMachine {

    Inventory vendingInventory = new Inventory();
    CoinBox vendingCoinBox = new CoinBox();

    TreeMap<String,Item> newInventory =  new TreeMap<>();

    public void  printInventory(){

        for(Map.Entry<String,Item> item: newInventory.entrySet()){
            if (item.getValue().getCurrentStock() == 0) {
                System.out.println(item.getValue().getLocation() + " : " + item.getValue().getName() + " costs $" + item.getValue().printDoublePrice() + " - SOLD OUT");
            }
            else System.out.println(item.getValue().getLocation() + " : " + item.getValue().getName() + " costs $" + item.getValue().printDoublePrice() + " - " + item.getValue().getCurrentStock() + " remaining");
            }
    }
    public String getBalanceInDollars() {
        return ("$" + String.format("%.2f", (vendingCoinBox.getBalance() / 100)));
    }

    public void printBalanceInDollars() {

        System.out.println();
        System.out.println("Your balance is: " + getBalanceInDollars());
    }

    public void feedMoney(int moneyIn) {
        moneyIn = moneyIn *100;
        vendingCoinBox.addFunds(moneyIn);
    }
    public void decreaseBalance(double itemPrice){
        itemPrice = itemPrice *100;
        vendingCoinBox.removeFunds(itemPrice);

    }

    public void purchase(String key) {

        if (this.vendingCoinBox.getBalance() >= newInventory.get(key).getPrice() && newInventory.get(key).getCurrentStock() > 0) {
            decreaseBalance(newInventory.get(key).getPrice());
            printBalanceInDollars();
            newInventory.get(key).vend();
        } else if (newInventory.get(key).getCurrentStock() < 1) {
            System.out.println("Sorry, " + newInventory.get(key).getName() + " is out of stock!");
        } else if (vendingCoinBox.getBalance() < newInventory.get(key).getPrice()){
            System.out.println("You need to deposit more funds to make that purchase.");
        }

    }

    public VendingMachine(){
    newInventory = vendingInventory.makeInventory();
    }


}
