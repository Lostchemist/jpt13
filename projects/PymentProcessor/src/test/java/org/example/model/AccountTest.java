package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;

    @BeforeEach
    public void setup() {
        account = new Account();
    }

    @Test
    void setName() {
        account.setName("Juan Lopez");

        assertNotNull(account.getName());
    }

    @Test
    void setAddresss() {
        account.setAddress("1a Avenida");
        assertNotNull(account.getAddress());
    }

    @Test
    void setBalance() {
        account.setBalance(new BigDecimal(100));
        assertEquals(new BigDecimal(100), account.getBalance());
    }

    @Test
    void setAccountNumber() {
        account.setAccountNumber(1);
        assertEquals(1, account.getAccountNumber());
    }
}
