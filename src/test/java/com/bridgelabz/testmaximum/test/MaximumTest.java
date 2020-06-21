package com.bridgelabz.testmaximum.test;

import com.bridgelabz.testmaximum.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaxInteger_WhenFirstPosition_ShouldReturnMaxInt() {
        Maximum maximum = new Maximum(6, 2, 1);
        Comparable max = maximum.findMaximum();
        Assert.assertEquals(6, max);
    }

    @Test
    public void givenMaxInteger_WhenSecondPosition_ShouldReturnMaxInt() {
        Maximum maximum = new Maximum(6, 8, 1);
        Comparable max = maximum.findMaximum();
        Assert.assertEquals(8, max);
    }

    @Test
    public void givenMaxInteger_WhenThirdPosition_ShouldReturnMaxInt() {
        Maximum maximum = new Maximum(6, 8, 9);
        Comparable max = maximum.findMaximum();
        Assert.assertEquals(9, max);
    }

    @Test
    public void givenMaxFloat_WhenFirstPosition_ShouldReturnMaxFloat() {

        Maximum maximum = new Maximum(5.5f, 2.5f, 2.4f);
        Comparable max = maximum.findMaximum();
        Assert.assertEquals(5.5f, max);
    }

    @Test
    public void givenMaxFloat_WhenSecondPosition_ShouldReturnMaxFloat() {
        Maximum maximum = new Maximum(5.5f, 16.5f, 2.4f);
        Comparable max = maximum.findMaximum();
        Assert.assertEquals(16.5f, max);
    }

    @Test
    public void givenMaxFloat_WhenThirdPosition_ShouldReturnMaxFloat() {
        Maximum maximum = new Maximum(5.5f, 16.5f, 23.4f);
        Comparable max = maximum.findMaximum();
        Assert.assertEquals(23.4f, max);
    }

    @Test
    public void givenMaxString_WhenFirstPosition_ShouldReturnMaxString() {
        Maximum maximum = new Maximum("apple", "Peach", "Banana");
        Comparable max = maximum.findMaximum();
        Assert.assertEquals("apple", max);
    }

    @Test
    public void givenMaxString_WhenSecondPosition_ShouldReturnMaxString() {
        Maximum maximum = new Maximum("Apple", "Peach", "Banana");
        Comparable max = maximum.findMaximum();
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenMaxString_WhenThirdPosition_ShouldReturnMaxString() {
        Maximum maximum = new Maximum("Apple", "Peach", "banana");
        Comparable max = maximum.findMaximum();
        Assert.assertEquals("banana", max);
    }
}