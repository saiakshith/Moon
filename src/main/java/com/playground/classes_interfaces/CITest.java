package com.playground.classes_interfaces;

public class CITest {
    public static void main(String[] args) {
        InterfaceA interfaceA = new InterfaceImpl();
        InterfaceImpl interfaceImpl = new InterfaceImpl();

        interfaceImpl.methodA();
        interfaceImpl.methodB();
        interfaceImpl.methodC();
    }
}
