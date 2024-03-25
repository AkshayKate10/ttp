package com.temp.domain;

import com.temp.exception.InvalidCreditCardException;
import com.temp.validator.Validators;

public class CreditCard {
    private int creditCardNumber;

    public CreditCard(int creditCardNumber) throws Exception {
        if (!Validators.isValidCreditCardNumber(creditCardNumber)) throw new InvalidCreditCardException();
        this.creditCardNumber = creditCardNumber;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }
}
