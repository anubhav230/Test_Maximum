package com.bridgelabz.testmaximum;

import java.util.Arrays;


public class Maximum<E extends Comparable<E>> {
    public Maximum() {

    }

    /**
     * @param val
     * @param <E>
     * @return
     */
    public <E extends Comparable<E>> E findMaximum(E... val) {

        E[] value = val;
        int length = value.length;
        Arrays.sort(value);
        return value[length - 1];
    }
}