package com.enh.java.playground.test;

import com.enh.java.playground.java.interfaces.DefaultAndStaticAndAbstractMethodInterface;
import com.enh.java.playground.java.interfaces.DefaultAndStaticAndAbstractMethodInterfaceImpl;

public class InterfaceTest {

    public static void main(String[] args) {
        DefaultAndStaticAndAbstractMethodInterfaceImpl defaultAndStaticMethodInterface = new DefaultAndStaticAndAbstractMethodInterfaceImpl();
//        defaultAndStaticMethodInterface.testDefaultMethod();
//        DefaultAndStaticAndAbstractMethodInterface.testStaticMethod();
        
        defaultAndStaticMethodInterface.testDotSuperOnInterface();
    }
}
