package com.temp;

import com.temp.domain.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardManagerTest {

    @Test
    void shouldAbleToCreateCustomer() throws Exception {
        int customerId = 1;
        String customerName = "Virat Kohli";
        String customerEmailId = "virtalkohli@gmail.com";
        CreditCardManager creditCardManager = new CreditCardManager();

        Customer actual = creditCardManager.create(customerId, customerName, customerEmailId);
        Customer expected = new Customer(customerId, customerName, customerEmailId);

        assertEquals(expected, actual);
    }
}
