package com.enh.java.test;

import com.enh.java.playground.java.interfaces.DefaultAndStaticAndAbstractMethodInterface;
import com.enh.java.playground.java.interfaces.DefaultAndStaticAndAbstractMethodInterfaceImpl;

public class GlobalTest {
    public static void main(String[] args) {
        DefaultAndStaticAndAbstractMethodInterfaceImpl defaultAndStaticMethodInterface = new DefaultAndStaticAndAbstractMethodInterfaceImpl();
//        defaultAndStaticMethodInterface.testDefaultMethod();
//        defaultAndStaticMethodInterface.testAbstractMethod();
//        DefaultAndStaticAndAbstractMethodInterface.testStaticMethod();
        
        defaultAndStaticMethodInterface.testDotSuperOnInterface();
    }
}
