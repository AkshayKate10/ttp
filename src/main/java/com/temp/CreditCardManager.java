package com.temp;

import com.temp.domain.CreditCard;
import com.temp.domain.Customer;

public class CreditCardManager {
    public Customer creatCustomer(int customerId, String customerName, String customerEmailId) throws Exception {
        return new Customer(customerId, customerName, customerEmailId);
    }

    public CreditCard creatCreditCard(int creditCardNumber) {
        return new CreditCard(creditCardNumber);
    }
}
