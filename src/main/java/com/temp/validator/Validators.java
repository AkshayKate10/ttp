package com.temp.validator;

import java.util.regex.Pattern;

public class Validators {
    static final String ONLY_CHARACTER_REGEX = "[0-9$@#%&^*()!]";
    static final String EMAIL_REGEX = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    static Pattern onlyCharactersPattern = Pattern.compile(ONLY_CHARACTER_REGEX);
    static Pattern emailPattern = Pattern.compile(EMAIL_REGEX);

    public static boolean isValidCustomerId(int customerId) {
        return customerId > 0;
    }

    public static boolean isValidCustomerName(String customerName) {
        if (customerName == null) return false;
        boolean invalidCustomerName = customerName.isEmpty() || onlyCharactersPattern.matcher(customerName).find();
        return !invalidCustomerName;
    }

    public static boolean isValidCustomerEmail(String customerEmailId) {
        if (customerEmailId == null) return false;
        return emailPattern.matcher(customerEmailId).find();
    }

    public static boolean isValidCreditCardNumber(int creditCardNumber) {
        return creditCardNumber < 9999 && creditCardNumber > 999;
    }
}
