package com.playground.classes_interfaces.test;

import com.playground.java.interfaces.DefaultAndStaticAndAbstractMethodInterface;
import com.playground.java.interfaces.DefaultAndStaticAndAbstractMethodInterfaceImpl;

public class InterfaceTest {

    public static void main(String[] args) {
        DefaultAndStaticAndAbstractMethodInterfaceImpl defaultAndStaticMethodInterface = new DefaultAndStaticAndAbstractMethodInterfaceImpl();
//        defaultAndStaticMethodInterface.testDefaultMethod();
//        DefaultAndStaticAndAbstractMethodInterface.testStaticMethod();
        
        defaultAndStaticMethodInterface.testDotSuperOnInterface();
    }
}
