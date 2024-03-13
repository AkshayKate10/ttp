package com.temp.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorsTest {

    @Test
    void validateCustomerId() {
        assertTrue(Validators.validateCustomerId(-1));
        assertTrue(Validators.validateCustomerId(0));

        assertFalse(Validators.validateCustomerId(1));

    }

    @Test
    void validateCustomerName() {
    }

    @Test
    void validateCustomerEmail() {
    }
}