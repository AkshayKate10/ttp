package com.temp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomerTest {

    @Test
    void shouldThrowExceptionOnInvalidCustomerId() {
        // Assert
        assertThrows(Exception.class, () -> {
            new Customer(-1, "Virat Kohli", "virtalkohli@gmail.com");
        });
        // Assert
        assertThrows(Exception.class, () -> {
            new Customer(0, "Virat Kohli", "virtalkohli@gmail.com");
        });
    }

    @Test
    void shouldThrowExceptionOnEmptyCustomerName() {
        // Assert
        assertThrows(Exception.class, () -> {
            new Customer(1, "", "virtalkohli@gmail.com");
        });
    }

    @Test
    void shouldThrowExceptionOnInvalidCustomerName() {
        // Assert
        assertThrows(Exception.class, () -> {
            new Customer(1, "Vir1 Koh55", "virtalkohli@gmail.com");
        });
    }

    @Test
    void shouldThrowExceptionOnWrongEmailFormat() {
        // Assert
        assertThrows(Exception.class, () -> {
            new Customer(1, "Virat Kohli", "virtalkohligmail.com");
        });
    }

}