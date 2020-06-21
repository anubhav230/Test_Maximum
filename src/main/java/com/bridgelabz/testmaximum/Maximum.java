package com.bridgelabz.testmaximum;

public class Maximum {
    /**
     * generic method for returning maximum value
     *
     * @param firstValue
     * @param secondValue
     * @param thirdValue
     * @param <E>
     * @return
     */
    public <E extends Comparable<E>> E findMaximum(E firstValue, E secondValue, E thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(thirdValue) > 0 && secondValue.compareTo(firstValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }
}
