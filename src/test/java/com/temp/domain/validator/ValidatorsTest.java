package com.temp.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidatorsTest {

    @Test
    void validateCustomerId() {
        assertTrue(Validators.isValidCustomerId(1));

        assertFalse(Validators.isValidCustomerId(-1));
        assertFalse(Validators.isValidCustomerId(0));
    }

    @Test
    void validateCustomerName() {
        assertTrue(Validators.isValidCustomerName("Virat Kohli"));

        assertFalse(Validators.isValidCustomerName("Virat1 Kohli"));
        assertFalse(Validators.isValidCustomerName("Virat! Kohli"));
        assertFalse(Validators.isValidCustomerName("Virat Kohli@"));
        assertFalse(Validators.isValidCustomerName("Virat #Kohli"));
        assertFalse(Validators.isValidCustomerName("Virat $Kohli"));
        assertFalse(Validators.isValidCustomerName("Virat Kohli%"));
        assertFalse(Validators.isValidCustomerName(")Virat Kohli"));
        assertFalse(Validators.isValidCustomerName("Virat( Kohli"));
        assertFalse(Validators.isValidCustomerName("Virat* Kohli"));
        assertFalse(Validators.isValidCustomerName("Virat^ Kohli"));
        assertFalse(Validators.isValidCustomerName(""));
        assertFalse(Validators.isValidCustomerName(null));
    }

    @Test
    void validateCustomerEmail() {
        assertTrue(Validators.isValidCustomerEmail("virtalkohli@gmail.com"));
        assertTrue(Validators.isValidCustomerEmail("virtal.kohli@gmail.com"));

        assertFalse(Validators.isValidCustomerEmail("virtalkohligmail.com"));
        assertFalse(Validators.isValidCustomerEmail("@virtalkohligmail.com"));
        assertFalse(Validators.isValidCustomerEmail(""));
        assertFalse(Validators.isValidCustomerEmail(null));
        assertFalse(Validators.isValidCustomerEmail("virtalkohli@gmail"));
        assertFalse(Validators.isValidCustomerEmail("virtalkohli&gmail.com"));
        assertFalse(Validators.isValidCustomerEmail("virtalkohli@&gmail.com"));
    }
}