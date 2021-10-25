package com.techelevator.view;

import com.techelevator.VendingMachine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VendingMachineTest {
    VendingMachine vendingmachineTest;

    @Before
    public void setup(){
        vendingmachineTest = new VendingMachine();
    }

    @Test
    public void test01_getBalanceInDollars(){
        vendingmachineTest.feedMoney(5);
        String expectedBalance = "$5.00";
        Assert.assertEquals(expectedBalance, vendingmachineTest.getBalanceInDollars());
    }

    @Test
    public void test02_DecreaseBalance(){
        vendingmachineTest.feedMoney(5);
        vendingmachineTest.decreaseBalance(2.00);
        String expectedBalance = "$3.00";
        Assert.assertEquals(expectedBalance, vendingmachineTest.getBalanceInDollars());
    }
    @Test
    public void test03_Purchase(){
        vendingmachineTest.feedMoney(5);
        vendingmachineTest.purchase("A1");
        String expectedBalance = "$1.95";
        Assert.assertEquals(expectedBalance,vendingmachineTest.getBalanceInDollars());


    }
}
