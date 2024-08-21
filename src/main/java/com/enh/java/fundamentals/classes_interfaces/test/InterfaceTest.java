package com.enh.java.fundamentals.classes_interfaces.test;

import com.enh.java.fundamentals.interfaces.DefaultAndStaticAndAbstractMethodInterfaceImpl;

public class InterfaceTest {

    public static void main(String[] args) {
        DefaultAndStaticAndAbstractMethodInterfaceImpl defaultAndStaticMethodInterface = new DefaultAndStaticAndAbstractMethodInterfaceImpl();
//        defaultAndStaticMethodInterface.testDefaultMethod();
//        DefaultAndStaticAndAbstractMethodInterface.testStaticMethod();
        
        defaultAndStaticMethodInterface.testDotSuperOnInterface();
    }
}
