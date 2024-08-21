package com.enh.java.fundamentals.classes_interfaces;

public interface InterfaceB {
//public interface InterfaceB {
    void iMethod();
    default void methodCommon() {
        System.out.println("methodCommon() " + InterfaceB.class);
    }
    default void methodB() {
        System.out.println("methodB() " + InterfaceB.class);
    }
}
