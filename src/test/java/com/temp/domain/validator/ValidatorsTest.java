package com.temp.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorsTest {

    @Test
    void validateCustomerId() {
        assertTrue(Validators.validateCustomerId(1));

        assertFalse(Validators.validateCustomerId(-1));
        assertFalse(Validators.validateCustomerId(0));
    }

    @Test
    void validateCustomerName() {
        assertTrue(Validators.validateCustomerName("Virat Kohli"));
        assertFalse(Validators.validateCustomerName("Virat1 Kohli"));
        assertFalse(Validators.validateCustomerName("Virat! Kohli"));
        assertFalse(Validators.validateCustomerName("Virat Kohli@"));
        assertFalse(Validators.validateCustomerName("Virat #Kohli"));
        assertFalse(Validators.validateCustomerName("Virat $Kohli"));
        assertFalse(Validators.validateCustomerName("Virat Kohli%"));
        assertFalse(Validators.validateCustomerName(")Virat Kohli"));
        assertFalse(Validators.validateCustomerName("Virat( Kohli"));
        assertFalse(Validators.validateCustomerName("Virat* Kohli"));
        assertFalse(Validators.validateCustomerName("Virat^ Kohli"));
        assertFalse(Validators.validateCustomerName(""));
        assertFalse(Validators.validateCustomerName(null));

    }

    @Test
    void validateCustomerEmail() {
    }
}