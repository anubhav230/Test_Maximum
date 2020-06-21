package com.bridgelabz.service;

import java.util.Arrays;


public class Maximum<E extends Comparable<E>> {

    /**
     * @param val
     * @param <E>
     * @return
     */
    public <E extends Comparable<E>> E findMaximum(E...val) {
        E[] value = val;
        int length = value.length;
        Arrays.sort(value);
        E max = value[length - 1];
        System.out.println(max);
        return max;
    }
}