package com.temp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testMain = new Main();

    @Test
    void returnTrueOnEmptyInput() {
        boolean result = testMain.empty("");
        assertTrue(result);
    }

    @Test
    void returnFalseOnValidInput() {
        boolean result = testMain.empty("12");
        assertFalse(result);
    }

    @Test
    void returnSumOnValidIntegerInput() {
        int result = testMain.commasPresent("5,6");
        assertEquals(11, result);
    }

    @Test
    void returnSumOnValidFloatInput() {
        double result = testMain.commasPresentWithDouble("5.5,3.5");
        assertEquals(9, result);
    }
}