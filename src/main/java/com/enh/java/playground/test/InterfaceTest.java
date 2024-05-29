package com.enh.java.playground.test;

import com.enh.java.playground.java.interfaces.DefaultAndStaticMethodInterface;
import com.enh.java.playground.java.interfaces.DefaultAndStaticMethodInterfaceImpl;

public class InterfaceTest {

    public static void main(String[] args) {
        DefaultAndStaticMethodInterfaceImpl defaultAndStaticMethodInterface = new DefaultAndStaticMethodInterfaceImpl();
        defaultAndStaticMethodInterface.testDefaultMethod();
        DefaultAndStaticMethodInterface.testStaticMethod();
    }
}
