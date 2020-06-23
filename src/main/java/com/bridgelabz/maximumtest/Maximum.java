package com.bridgelabz.maximumtest;

import java.util.Arrays;

public class Maximum<E> {
    /**
     * Method to sort and find out maximum value from array
     *
     * @param value
     * @return
     */
    public E findMaximum(E... value) {
        int length = value.length;
        Arrays.sort(value);
        E max = value[length - 1];
        System.out.println(max);
        return max;
    }

}