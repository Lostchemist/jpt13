package org.example.service;

import org.example.model.Account;

import java.math.BigDecimal;

public class PaymentProcessor {
    public void processTaxExemptPurchase(Account seller, Account buyer, BigDecimal purchaseAmount) {
        if(buyer.getBalance().compareTo(purchaseAmount) > -1) {
            throw new IllegalArgumentException("Buyer doesn't have enough money to complete the transaction");
        }
        buyer.setBalance(buyer.getBalance().subtract(purchaseAmount));
        seller.setBalance(seller.getBalance().add(purchaseAmount));
    }

    public void processTaxPurchase(Account seller, Account buyer, BigDecimal purchaseAmount) {

    }

    public void issueRefund(Account seller, Account buyer, BigDecimal purchaseAmount) {

    }


}
