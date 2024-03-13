package com.temp.domain;

import java.util.Objects;
import java.util.regex.Pattern;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmailId;
    final String onlyCharactersPattern = "[0-9$@#%&^*()!]";
    Pattern onlyCharacters = Pattern.compile(onlyCharactersPattern);

    public Customer(int customerId, String customerName, String customerEmailId) throws Exception {
        if (customerId <= 0) throw new Exception();
        if (onlyCharacters.matcher(customerName).find()) throw new Exception();

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
