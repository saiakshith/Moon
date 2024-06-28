package com.playground.java.practicals.classes_interfaces.test;

import com.playground.java.practicals.class_loading.OuterClass;

public class JavaClassLoadingTest {
    public static void main(String[] args) {
        new OuterClass.InnerStaticClass().innerStaticClassInstanceMethod();
        new OuterClass.InnerStaticClass().innerStaticClassInstanceMethod();
    }
}
