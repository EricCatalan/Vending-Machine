package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CandyTests {

    Candy testCandy;

    @Before
    public void setup() {
        testCandy = new Candy("E1", "Test Candy", "1.00");
    }

    @Test
    public void test01_vendCurrentStock() {

        int expectedStock = 4;

        testCandy.vend();

        Assert.assertEquals(expectedStock, testCandy.getCurrentStock());
    }
}
