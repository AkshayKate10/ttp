package com.temp.domain;

import com.temp.exception.InvalidCreditCardException;

public class CreditCard {
    private int creditCardNumber;

    public CreditCard(int creditCardNumber) throws Exception {
        if (creditCardNumber == 0) throw new InvalidCreditCardException();
        if (creditCardNumber > 9999 || creditCardNumber < 999)
            throw new InvalidCreditCardException(); // Assuming Credit Card is 4-digit number
        this.creditCardNumber = creditCardNumber;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }
}
