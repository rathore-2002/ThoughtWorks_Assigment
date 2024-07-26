package com.example.math.operations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {

    @Test
    public void testOneRaisedToOneIsOne() {
        int expected = 1;
        int actual = PowerFinder.calculatePower(1, 1);
        assertEquals(expected, actual, "1 raised to the power of 1 should be 1.");
    }

    @Test
    public void testTwoRaisedToOneIsTwo() {
        int expected = 2;
        int actual = PowerFinder.calculatePower(2, 1);
        assertEquals(expected, actual, "2 raised to the power of 1 should be 2.");
    }

    @Test
    public void testTwoPowerTwoIsFour() {
        int expected = 4;
        int actual = PowerFinder.calculatePower(2, 2);
        assertEquals(expected, actual, "2 raised to the power of 2 should be 4.");
    }

    @Test
    public void testThreePowerTwoIsNine() {
        int expected = 9;
        int actual = PowerFinder.calculatePower(3, 2);
        assertEquals(expected, actual, "3 raised to the power of 2 should be 9.");
    }
}
