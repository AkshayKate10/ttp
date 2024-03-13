package com.temp.domain;

import com.temp.domain.exception.InvalidCustomerEmailException;
import com.temp.domain.exception.InvalidCustomerIdException;
import com.temp.domain.exception.InvalidCustomerNameException;
import com.temp.domain.validator.Validators;

import java.util.Objects;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmailId;


    public Customer(int customerId, String customerName, String customerEmailId) throws Exception {
        if (Validators.validateCustomerId(customerId)) throw new InvalidCustomerIdException();
        if (Validators.validateCustomerName(customerName)) throw new InvalidCustomerNameException();
        if (Validators.validateCustomerEmail(customerEmailId)) throw new InvalidCustomerEmailException();

        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmailId = customerEmailId;
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
