package com.enh.java.test;

import com.playground.java.practicals.interfaces.DefaultAndStaticAndAbstractMethodInterface;
import com.playground.java.practicals.interfaces.DefaultAndStaticAndAbstractMethodInterfaceImpl;

public class GlobalTest {
    public static void main(String[] args) {
        DefaultAndStaticAndAbstractMethodInterfaceImpl defaultAndStaticMethodInterface = new DefaultAndStaticAndAbstractMethodInterfaceImpl();
//        defaultAndStaticMethodInterface.testDefaultMethod();
//        defaultAndStaticMethodInterface.testAbstractMethod();
//        DefaultAndStaticAndAbstractMethodInterface.testStaticMethod();
        
        defaultAndStaticMethodInterface.testDotSuperOnInterface();
    }
}
