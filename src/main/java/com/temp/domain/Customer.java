package com.temp.domain;

import com.temp.domain.exception.InvalidCustomerEmailException;
import com.temp.domain.exception.InvalidCustomerIdException;
import com.temp.domain.exception.InvalidCustomerNameException;

import java.util.Objects;
import java.util.regex.Pattern;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmailId;
    final String onlyCharactersRegex = "[0-9$@#%&^*()!]";
    final String emailRegex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    ;
    Pattern onlyCharactersPattern = Pattern.compile(onlyCharactersRegex);
    Pattern emailPattern = Pattern.compile(emailRegex);

    public Customer(int customerId, String customerName, String customerEmailId) throws Exception {
        if (customerId <= 0) throw new InvalidCustomerIdException();
        if (customerName.isEmpty() || onlyCharactersPattern.matcher(customerName).find())
            throw new InvalidCustomerNameException();
        if (!emailPattern.matcher(customerEmailId).find()) throw new InvalidCustomerEmailException();

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
