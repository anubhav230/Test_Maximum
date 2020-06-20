package com.bridgelabz.testmaximum.test;

import com.bridgelabz.testmaximum.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenInteger_WhenProper_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Integer maxInt[] = {5, 8, 1};
        Assert.assertEquals(maximum.findMaximum(maxInt),maxInt[1]);
    }

    @Test
    public void givenInteger_WhenWrong_ShouldReturnFalse() {
        Maximum maximum = new Maximum();
        Integer maxInt[] = {10, 8, 1};
        Assert.assertEquals(maximum.findMaximum(maxInt),maxInt[0]);
    }

}
