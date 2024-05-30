package com.enh.java.design_patterns.factory.example.specific;

import static com.enh.java.util.PlaygroundUtil.log;

public class Bus implements Vehicle {
    @Override
    public void display() {
        log("This is a class of type : " + Bus.class);
    }
}
