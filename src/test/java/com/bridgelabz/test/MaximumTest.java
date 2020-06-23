package com.bridgelabz.test;

import com.bridgelabz.maximumtest.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum maximum = new Maximum();

    @Test
    public void givenInteger_WhenFirstPosition_ShouldReturnMaxInt() {
        Assert.assertEquals(8, maximum.findMaximum(6, 8, 1));
    }

    @Test
    public void givenInteger_WhenSecondPosition_ShouldReturnMaxInt() {
        Assert.assertEquals(34, maximum.findMaximum(6, 34, 1));
    }

    @Test
    public void givenInteger_WhenThirdPosition_ShouldReturnMaxInt() {
        Assert.assertEquals(6, maximum.findMaximum(4, 2, 6));
    }

    @Test
    public void givenInteger_WhenMore_ShouldReturnMaxInt() {
        Assert.assertEquals(8, maximum.findMaximum(4, 2, 6, 7, 8, 2));
    }

    @Test
    public void givenFloat_WhenFirstPosition_ShouldReturnMaxFloat() {
        Assert.assertEquals(5.5f, maximum.findMaximum(5.5f, 2.5f, 2.4f));
    }

    @Test
    public void givenFloat_WhenSecondPosition_ShouldReturnMaxFloat() {
        Assert.assertEquals(16.5f, maximum.findMaximum(5.5f, 16.5f, 2.4f));
    }

    @Test
    public void givenFloat_WhenThirdPosition_ShouldReturnMaxFloat() {
        Assert.assertEquals(23.4f, maximum.findMaximum(5.5f, 16.5f, 23.4f));
    }

    @Test
    public void givenFloat_WhenMoreValues_ShouldReturnMaxFloat() {
        Assert.assertEquals(80.4f, maximum.findMaximum(5.5f, 16.5f, 23.4f, 5.6f, 80.4f, 23.5f));
    }

    @Test
    public void givenString_WhenFirstPosition_ShouldReturnMaxString() {
        Assert.assertEquals("apple", maximum.findMaximum("apple", "Peach", "Banana"));
    }

    @Test
    public void givenString_WhenSecondPosition_ShouldReturnMaxString() {
        Assert.assertEquals("Peach", maximum.findMaximum("Apple", "Peach", "Banana"));
    }

    @Test
    public void givenString_WhenThirdPosition_ShouldReturnMaxString() {
        Assert.assertEquals("banana", maximum.findMaximum("Apple", "Peach", "banana"));
    }

    @Test
    public void givenString_WhenMoreValues_ShouldReturnMaxString() {
        Assert.assertEquals("apple", maximum.findMaximum("apple", "Peach", "Banana", "Lion", "Tiger"));
    }
}