package com.temp.domain;

import com.temp.exception.InvalidCustomerEmailException;
import com.temp.exception.InvalidCustomerIdException;
import com.temp.exception.InvalidCustomerNameException;
import com.temp.validator.Validators;

import java.util.Objects;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmailId;
    private int creditCardNumber;

    public Customer(int customerId, String customerName, String customerEmailId) throws Exception {
        if (!Validators.isValidCustomerId(customerId)) throw new InvalidCustomerIdException();
        if (!Validators.isValidCustomerName(customerName)) throw new InvalidCustomerNameException();
        if (!Validators.isValidCustomerEmail(customerEmailId)) throw new InvalidCustomerEmailException();

        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmailId = customerEmailId;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId && Objects.equals(customerName, customer.customerName) && Objects.equals(customerEmailId, customer.customerEmailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerEmailId);
    }


}
