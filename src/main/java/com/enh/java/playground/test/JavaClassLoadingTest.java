package com.enh.java.playground.test;

import com.enh.java.playground.java.class_loading.OuterClass;

public class JavaClassLoadingTest {
    public static void main(String[] args) {
        new OuterClass.InnerStaticClass().innerStaticClassInstanceMethod();
        new OuterClass.InnerStaticClass().innerStaticClassInstanceMethod();
    }
}
