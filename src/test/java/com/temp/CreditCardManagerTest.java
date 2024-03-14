package com.temp;

import com.temp.domain.CreditCard;
import com.temp.domain.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardManagerTest {

    @Test
    void shouldAbleToCreateCustomer() throws Exception {
        // Arrange
        int customerId = 1;
        String customerName = "Virat Kohli";
        String customerEmailId = "virtalkohli@gmail.com";

        // Act
        CreditCardManager creditCardManager = new CreditCardManager();

        Customer actual = creditCardManager.creatCustomer(customerId, customerName, customerEmailId);
        Customer expected = new Customer(customerId, customerName, customerEmailId);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void shouldCreateCreditCardAndAssignToCustomer() throws Exception {
        // Arrange
        int customerId = 1;
        int creditCardNumber = 1234;
        String customerName = "Virat Kohli";
        String customerEmailId = "virtalkohli@gmail.com";

        // Act
        CreditCardManager creditCardManager = new CreditCardManager();
        Customer customer = creditCardManager.creatCustomer(customerId, customerName, customerEmailId);
        CreditCard creditCard = creditCardManager.creatCreditCard(creditCardNumber);
        customer.setCreditCardNumber(creditCard.getCreditCardNumber());

        // Assert
        assertEquals(1234, customer.getCreditCardNumber());
    }
}
