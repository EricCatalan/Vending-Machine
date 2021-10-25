package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CoinBoxTests {

    private final double ONE_DOLLAR = 100.00;
    private final double TWO_DOLLARS = 200.00;
    private final double FIVE_DOLLARS = 500.00;
    private final double TEN_DOLLARS = 1000.00;

    CoinBox testCoinBox;

    @Before
    public void setup() {
        testCoinBox = new CoinBox();
    }

    @Test
    public void test01_addFunds() {

        testCoinBox.setBalance(TEN_DOLLARS);
        testCoinBox.addFunds(FIVE_DOLLARS);

        double expectedValue = TEN_DOLLARS + FIVE_DOLLARS;

        Assert.assertEquals(expectedValue, testCoinBox.getBalance(), 0.01);

    }

    @Test
    public void test02_removeFunds() {

        testCoinBox.setBalance(TWO_DOLLARS);
        testCoinBox.removeFunds(ONE_DOLLAR);

        double expectedValue = TWO_DOLLARS - ONE_DOLLAR;

        Assert.assertEquals(expectedValue, testCoinBox.getBalance(), 0.01);

    }

    @Test
    public void test03_printBalance() {

        testCoinBox.setBalance(TEN_DOLLARS);

        String expectedString = "$10.00";

        Assert.assertEquals(expectedString, testCoinBox.printBalance());
    }

    @Test
    public void test04_giveChange() {

        testCoinBox.setBalance(TEN_DOLLARS);

        double expectedValue = 0.00;
        testCoinBox.giveChange();

        Assert.assertEquals(expectedValue, testCoinBox.getBalance(), 0.01);
    }


}
