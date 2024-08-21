package com.enh.java.fundamentals.classes_interfaces;

public interface InterfaceA {
    
    void iMethod();
    default void methodCommon() {
        System.out.println("methodCommon() " + InterfaceA.class);
    }
    default void methodA() {
        System.out.println("methodA() " + InterfaceA.class);
    }
}
