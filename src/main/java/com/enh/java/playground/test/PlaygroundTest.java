package com.enh.java.playground.test;

import com.enh.java.playground.Account;

import java.math.BigDecimal;

public class PlaygroundTest {
    
    public static void log(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(BigDecimal.ONE);

    }
}

class PlaygroundTest2 {
    
}
