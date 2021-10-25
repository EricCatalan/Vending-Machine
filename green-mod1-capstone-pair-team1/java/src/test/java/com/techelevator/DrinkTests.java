package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DrinkTests {

    Drink testDrink;

    @Before
    public void setup() {
        testDrink = new Drink("E1", "Test Drink", "1.00");
    }

    @Test
    public void test01_vendCurrentStock() {

        int expectedStock = 4;

        testDrink.vend();

        Assert.assertEquals(expectedStock, testDrink.getCurrentStock());
    }
}
