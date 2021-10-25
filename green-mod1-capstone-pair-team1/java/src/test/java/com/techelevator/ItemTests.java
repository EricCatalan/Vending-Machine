package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ItemTests {

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

    @Test
    public void test02_printDoublePrice() {

        String expectedPrice = "1.00";

        Assert.assertEquals(expectedPrice, testCandy.printDoublePrice());
    }

}
