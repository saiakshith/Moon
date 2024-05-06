package com.enh.java.classes_interfaces;

public interface InterfaceA {
    
    default void methodA() {
        System.out.println("Mehotd A " + InterfaceA.class);
    }
}
