package com.bridgelabz.test;

import com.bridgelabz.maximumtest.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum maximum = new Maximum();

    @Test
    public void givenInteger_WhenFirstPosition_ShouldReturnMaxInt() {
        Comparable max = maximum.findMaximum(6, 8, 1);
        Assert.assertEquals(8, max);
    }

    @Test
    public void givenInteger_WhenSecondPosition_ShouldReturnMaxInt() {
        Comparable max = maximum.findMaximum(6, 34, 1);
        Assert.assertEquals(34, max);
    }

    @Test
    public void givenInteger_WhenThirdPosition_ShouldReturnMaxInt() {
        Comparable max = maximum.findMaximum(4,2,6);
        Assert.assertEquals(6, max);
    }

    @Test
    public void givenInteger_WhenMore_ShouldReturnMaxInt() {
        Comparable max = maximum.findMaximum(4,2,6,7,8,2);
        Assert.assertEquals(8, max);
    }

    @Test
    public void givenFloat_WhenFirstPosition_ShouldReturnMaxFloat() {
        Comparable max = maximum.findMaximum(5.5f, 2.5f, 2.4f);
        Assert.assertEquals(5.5f, max);
    }

    @Test
    public void givenFloat_WhenSecondPosition_ShouldReturnMaxFloat() {
        Comparable max = maximum.findMaximum(5.5f, 16.5f, 2.4f);
        Assert.assertEquals(16.5f, max);
    }

    @Test
    public void givenFloat_WhenThirdPosition_ShouldReturnMaxFloat() {
        Comparable max = maximum.findMaximum(5.5f, 16.5f, 23.4f);
        Assert.assertEquals(23.4f, max);
    }

    @Test
    public void givenFloat_WhenMoreValues_ShouldReturnMaxFloat() {
        Comparable max = maximum.findMaximum(5.5f, 16.5f, 23.4f, 5.6f, 80.4f, 23.5f);
        Assert.assertEquals(80.4f, max);
    }

    @Test
    public void givenString_WhenFirstPosition_ShouldReturnMaxString() {
        Comparable max = maximum.findMaximum("apple", "Peach", "Banana");
        Assert.assertEquals("apple", max);
    }

    @Test
    public void givenString_WhenSecondPosition_ShouldReturnMaxString() {
        Comparable max = maximum.findMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenString_WhenThirdPosition_ShouldReturnMaxString() {
        Comparable max = maximum.findMaximum("Apple", "Peach", "banana");
        Assert.assertEquals("banana", max);
    }

    @Test
    public void givenString_WhenMoreValues_ShouldReturnMaxString() {
        Comparable max = maximum.findMaximum("apple", "Peach", "Banana", "Lion", "Tiger");
        Assert.assertEquals("apple", max);
    }
}