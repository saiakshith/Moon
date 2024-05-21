package com.enh.java.interfaces;

public interface InterfaceA {
    
    default void methodA() {
        System.out.println("Mehotd A " + InterfaceA.class);
    }
}
