package com.enh.java.playground.java.test_classes;

public class ClassA implements InterfaceA {

    public String returnStringWithParams(String s, int i) {
        return s.substring(i);
    }
    
    protected String modifyCart() {
        
        InterfaceA.super.defaultMethod();
       return null;
    }
}
