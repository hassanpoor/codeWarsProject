package org.example;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DescendingOrderTest {

    @Test
    @Ignore
    public void sortDesc(){
        Assert.assertEquals(DescendingOrder.sortDesc(16587469),98766541);
    }
}