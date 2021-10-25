package com.techelevator;

public class CoinBox {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public CoinBox() {
        balance = 0;
    }

    public void addFunds(double moneyIn) {
        balance = balance + moneyIn;
    }

    public void removeFunds(double moneyOut) {
        balance = balance - moneyOut;
    }

    public String printBalance() {
        return ("$" + String.format("%.2f", (getBalance() / 100)));
    }

    public void giveChange() {

        double previousBalance = (getBalance() / 100.00);
        double changeDue = (getBalance() / 100.00);

        int quarters = 0;
        int dimes = 0;
        int nickels = 0;

        while (changeDue >= 0.25) {
            quarters++;
            changeDue -= 0.25;
        }
        while (changeDue >= 0.10) {
            dimes++;
            changeDue -= 0.10;
        }
        while (changeDue >= 0.05) {
            nickels++;
            changeDue -= 0.05;
        }

        System.out.println("Your remaining balance is: $" + String.format("%.2f", previousBalance));
        System.out.println("Your change is: " + quarters + " quarter(s), " + dimes + " dime(s), and " + nickels + " nickel(s).");

        setBalance(0);
    }
}
