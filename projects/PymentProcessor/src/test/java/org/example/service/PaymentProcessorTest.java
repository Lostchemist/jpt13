package org.example.service;

import org.example.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {

    private Account buyer;
    private Account seller;

    private PaymentProcessor paymentProcessor;


    @BeforeEach
    void setUp() {
        buyer = new Account("Toni Mas", "Calle 1", new BigDecimal(100), 1);
        seller = new Account("Mario Mas", "Calle 2", new BigDecimal(200), 2);

        paymentProcessor = new PaymentProcessor();
    }

    @Test
    void processTaxExemptPurchase() {

        paymentProcessor.processTaxExemptPurchase(seller, buyer, new BigDecimal(10));

        assertEquals(new BigDecimal(90), buyer.getBalance());
        assertEquals(new BigDecimal(210), seller.getBalance());

    }

    @Test
    void processTaxExemptPurchaseNotEnoughFounds() {
        assertThrows(IllegalArgumentException.class, ()-> paymentProcessor.processTaxExemptPurchase(seller, buyer, new BigDecimal(10000)));
    }

//    @Test
//    void processTaxPurchase() {
//    }
//
//    @Test
//    void issueRefund() {
//    }
//
//    @Test
//    void testProcessTaxExemptPurchase() {
//    }
}
