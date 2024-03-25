package com.temp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CreditCardTest {
    @Test
    void shouldThrowExceptionOnInvalidCreditCardNumber() {
        // Assert
        assertThrows(Exception.class, () -> {
            new CreditCard(12333);
        });
        // Assert
        assertThrows(Exception.class, () -> {
            new CreditCard(0);
        });
    }
}