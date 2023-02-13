package org.example.model;

import java.math.BigDecimal;

public class Account {
    private String name;
    private String address;

    private BigDecimal balance;

    private long accountNumber;

    public Account() {
    }

    public Account(String name, String address, BigDecimal balance, long accountNumber) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Account)) {
            return false;
        }
        Account acc = (Account) obj;

        if (!acc.getName().equals(this.name)) {
            return false;
        }

        if (!acc.getAddress().equals(this.address)) {
            return false;
        }

        if (!acc.getBalance().equals(this.balance)) {
            return false;
        }
        if (acc.getAccountNumber() != this.accountNumber) {
            return false;
        }

        return true;
    }

    @Override
    public String toString()  {
        return this.name + " " + this.accountNumber;
    }
}
