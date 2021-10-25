package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChipTests {

    Chip testChip;

    @Before
    public void setup() {
        testChip = new Chip("E1", "Test Chip", "1.00");
    }

    @Test
    public void test01_vendCurrentStock() {

        int expectedStock = 4;

        testChip.vend();

        Assert.assertEquals(expectedStock, testChip.getCurrentStock());
    }
}
