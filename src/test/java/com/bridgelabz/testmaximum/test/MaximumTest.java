package com.bridgelabz.testmaximum.test;

import com.bridgelabz.testmaximum.Maximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    Maximum maximum = new Maximum();

    @Test
    public void givenMaxInteger_WhenFirstPosition_ShouldReturnMaxInt() {

        int max = maximum.findMaximum(3,1,2);
        Assert.assertEquals(3, max);
    }

    @Test
    public void givenMaxInteger_WhenSecondPosition_ShouldReturnMaxInt() {
        int max = maximum.findMaximum(3,8,2);
        Assert.assertEquals(8, max);
    }

    @Test
    public void givenMaxInteger_WhenThirdPosition_ShouldReturnMaxInt() {
        int max = maximum.findMaximum(3,8,12);
        Assert.assertEquals(12, max);
    }

    @Test
    public void givenMaxFloat_WhenFirstPosition_ShouldReturnMaxFloat() {

        float max = maximum.findMaximum(51.4f, 50.2f,9.5f);
        Assert.assertEquals(51.4f, max, 0.0f);
    }

    @Test
    public void givenMaxFloat_WhenSecondPosition_ShouldReturnMaxFloat() {

        float max = maximum.findMaximum(51.4f, 52.2f,9.5f);
        Assert.assertEquals(52.2f, max, 0.0f);
    }

    @Test
    public void givenMaxFloat_WhenThirdPosition_ShouldReturnMaxFloat() {
        float max = maximum.findMaximum(1.4f, 5.2f,9.5f);
        Assert.assertEquals(9.5f, max, 0.0f);
    }

    @Test
    public void givenMaxString_WhenFirstPosition_ShouldReturnMaxString() {
        String max = maximum.findMaximum("apple","Peach","Banana");
        Assert.assertEquals("apple", max);
    }

    @Test
    public void givenMaxString_WhenSecondPosition_ShouldReturnMaxString() {
        String max = maximum.findMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach", max);
    }

    @Test
    public void givenMaxString_WhenThirdPosition_ShouldReturnMaxString() {
        String max = maximum.findMaximum("Apple","Peach","banana");
        Assert.assertEquals("banana", max);
    }
}
