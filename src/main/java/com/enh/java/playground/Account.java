package com.enh.java.playground;

import java.math.BigDecimal;

public class Account {

    public BigDecimal balance;

    public Account() {
        balance = new BigDecimal(0.0).setScale(2);
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    public String getBalanceString() {
        return balance.toString();
    }
}
