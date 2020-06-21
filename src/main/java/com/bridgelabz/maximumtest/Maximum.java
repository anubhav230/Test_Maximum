package com.bridgelabz.maximumtest;

import java.util.Arrays;


public class Maximum<E extends Comparable<E>> {

    /**
     * @param val
     * @param <E>
     * @return
     */
    public <E extends Comparable<E>> E findMaximum(E...val) {
        int length = val.length;
        Arrays.sort(val);
        E max = val[length - 1];
        System.out.println(max);
        return max;
    }
}