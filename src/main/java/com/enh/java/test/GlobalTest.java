package com.enh.java.test;

import com.enh.java.playground.java.interfaces.DefaultAndStaticMethodInterface;
import com.enh.java.playground.java.interfaces.DefaultAndStaticMethodInterfaceImpl;

public class GlobalTest {
    public static void main(String[] args) {
        DefaultAndStaticMethodInterfaceImpl defaultAndStaticMethodInterface = new DefaultAndStaticMethodInterfaceImpl();
        defaultAndStaticMethodInterface.testDefaultMethod();
        DefaultAndStaticMethodInterface.testStaticMethod();
    }
}
