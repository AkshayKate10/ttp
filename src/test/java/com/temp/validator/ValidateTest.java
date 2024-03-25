package com.temp.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class ValidateTest {
    @Test
    void shouldReturnExceptionOnInvalidInputs() {
        assertFalse(Validate.isValidInput(""));
        assertFalse(Validate.isValidInput("IN   Valid"));
        assertFalse(Validate.isValidInput("   In Valid"));
        assertFalse(Validate.isValidInput("In Valid"));
        assertFalse(Validate.isValidInput("InValid    "));
//        assertFalse(Validate.isValidInput("12333"));
        assertFalse(Validate.isValidInput("IN123 Valid"));
        assertFalse(Validate.isValidInput("    Invalid"));

    }

}