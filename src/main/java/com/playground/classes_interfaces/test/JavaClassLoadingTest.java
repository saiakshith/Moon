package com.playground.classes_interfaces.test;

import com.playground.java.class_loading.OuterClass;

public class JavaClassLoadingTest {
    public static void main(String[] args) {
        new OuterClass.InnerStaticClass().innerStaticClassInstanceMethod();
        new OuterClass.InnerStaticClass().innerStaticClassInstanceMethod();
    }
}
