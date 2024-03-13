package com.temp;

import com.temp.domain.Customer;

public class CreditCardManager {
    public Customer create(int customerId, String customerName, String customerEmailId) {
        return new Customer(customerId, customerName, customerEmailId);
    }
}
