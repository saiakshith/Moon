package com.enh.java.playground.java.test_classes;

import static com.enh.java.util.PlaygroundUtil.log;

public interface InterfaceA {
    
    default void defaultMethod() {
        log("Default method of : " + InterfaceA.class);
    }
}
