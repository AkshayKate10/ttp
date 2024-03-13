package com.temp.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomerTest {

    @Test
    void shouldThrowExceptionOnInvalidCustomerId() {
        assertThrows(Exception.class, () -> {
            new Customer(-1, "Virat Kohli", "virtalkohli@gmail.com");
        });

        assertThrows(Exception.class, () -> {
            new Customer(0, "Virat Kohli", "virtalkohli@gmail.com");
        });
    }

    @Test
    void shouldThrowExceptionOnEmptyCustomerName() {
        assertThrows(Exception.class, () -> {
            new Customer(1, "", "virtalkohli@gmail.com");
        });
    }

    @Test
    void shouldThrowExceptionOnInvalidCustomerName() {
        assertThrows(Exception.class, () -> {
            new Customer(1, "Vir1 Koh55", "virtalkohli@gmail.com");
        });
    }

    @Test
    void shouldThrowExceptionOnWrongEmailFormat() {
        assertThrows(Exception.class, () -> {
            new Customer(1, "Virat Kohli", "virtalkohligmail.com");
        });
    }

}