package com.enh.java.design_patterns.factory.example.generic;

import static com.enh.java.util.PlaygroundUtil.log;

public class ConcreteProductA implements Product {
    @Override
    public void display() {
        log("This is a class of type : " + ConcreteProductA.class);
    }
}
