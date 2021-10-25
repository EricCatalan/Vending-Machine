package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GumTests {

    Gum testGum;

    @Before
    public void setup() {
        testGum = new Gum("E1", "Test Gum", "1.00");
    }

    @Test
    public void test01_vendCurrentStock() {

        int expectedStock = 4;

        testGum.vend();

        Assert.assertEquals(expectedStock, testGum.getCurrentStock());
    }
}
