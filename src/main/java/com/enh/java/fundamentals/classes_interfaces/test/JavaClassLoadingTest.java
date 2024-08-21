package com.enh.java.fundamentals.classes_interfaces.test;

import com.enh.java.fundamentals.class_loading.OuterClass;

public class JavaClassLoadingTest {
    public static void main(String[] args) {
        new OuterClass.InnerStaticClass().innerStaticClassInstanceMethod();
        new OuterClass.InnerStaticClass().innerStaticClassInstanceMethod();
    }
}
