package com.enh.java.interfaces;

public interface InterfaceB extends InterfaceA {
//public interface InterfaceB {
    
    default void methodA() {
        System.out.println("Mehotd A " + InterfaceB.class);
    }
    default void methodB() {
        System.out.println("Mehotd B " + InterfaceB.class);
    }
}
