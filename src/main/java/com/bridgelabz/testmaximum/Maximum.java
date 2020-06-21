package com.bridgelabz.testmaximum;

public class Maximum<E extends Comparable<E>> {
    private E firstValue;
    private E secondValue;
    private E thirdValue;

    public Maximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    /**
     * method to fid maximum value of generic type
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

    public E findMaximum() {
        return findMaximum(firstValue, secondValue, thirdValue);
    }
}