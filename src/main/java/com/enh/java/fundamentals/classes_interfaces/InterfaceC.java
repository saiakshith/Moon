package com.enh.java.fundamentals.classes_interfaces;

//public interface InterfaceC extends InterfaceA {
public interface InterfaceC {
//public interface InterfaceC {
    default void methodA() {
        System.out.println("Mehotd A " + InterfaceC.class);
    }
    default void methodC() {
        System.out.println("Mehotd C " + InterfaceC.class);
    }
}
