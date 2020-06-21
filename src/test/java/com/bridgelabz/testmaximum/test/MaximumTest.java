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
    public void givenInteger_WhenProperSecond_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Integer maxInt[] = {10, 8, 1};
        Assert.assertEquals(maximum.findMaximum(maxInt),maxInt[0]);
    }

    @Test
    public void givenInteger_WhenProperThird_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Integer maxInt[] = {23, 6,9};
        Assert.assertEquals(maximum.findMaximum(maxInt),maxInt[0]);
    }

    @Test
    public void givenFloat_WhenProper_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Float maxInt[] = {23.4f, 50.2f,9.5f};
        Assert.assertEquals(maximum.findMaximum(maxInt),maxInt[1]);
    }

    @Test
    public void givenFloat_WhenProperTwo_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Float maxInt[] = {2.3f, 2.2f,2.5f};
        Assert.assertEquals(maximum.findMaximum(maxInt),maxInt[2]);
    }

    @Test
    public void givenFloat_WhenProperThird_ShouldReturnTrue() {
        Maximum maximum = new Maximum();
        Float maxInt[] = {0.9f, 0.2f,0.5f};
        Assert.assertEquals(maximum.findMaximum(maxInt),maxInt[0]);
    }

}
