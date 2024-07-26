package com.example.math.operations;

/**
 * Author: Priya Rathore
 */
public class PowerFinder {

    /**
     * Method to calculate power of number
     * @param base
     * @param exponent
     * @return
     */
    public static int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
