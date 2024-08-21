package com.enh.java.fundamentals.classes_interfaces;

public class ClassA implements InterfaceA, InterfaceB {


    @Override
    public void iMethod() {
        System.out.println("Overridden method of InterfaceA, InterfaceB from ClassA");
    }

    @Override
    public void methodCommon() {
        InterfaceA.super.methodCommon();
        InterfaceB.super.methodCommon();
        System.out.println("Overridden methodCommon() from InterfaceA, InterfaceB from ClassA");
    }
}
