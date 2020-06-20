package com.bridgelabz.testmaximum;

public class Maximum {
    /**
     *
     * @param maxInt
     * @return
     */
    public Integer findMaximum(Integer[] maxInt ) {
        Integer max = 0;
        for (Integer index : maxInt) {
            if (index.compareTo(max) > 0)
                max = index;
        }
        return max;
    }
}
