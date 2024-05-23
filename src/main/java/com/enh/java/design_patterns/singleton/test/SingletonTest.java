package com.enh.java.design_patterns.singleton.test;

import com.enh.java.design_patterns.singleton.SingletonEager;
import com.enh.java.design_patterns.singleton.SingletonLazy;
import com.enh.java.design_patterns.singleton.SingletonStaticBlock;

public class SingletonTest {
    
    public static void log(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) {
//        testSingletonEager();
//        testSingletonStaticBlock();
        testSingletonLazy();
    }

    private static void testSingletonLazy() {
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        
        log(singletonLazy1 == singletonLazy2);
        log(singletonLazy1);
        log(singletonLazy2);
    }
    
    private static void testSingletonStaticBlock() {
        SingletonStaticBlock singletonStaticBlock1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock singletonStaticBlock2 = SingletonStaticBlock.getInstance();

        log(singletonStaticBlock1 == singletonStaticBlock2);
        log(singletonStaticBlock1);
        log(singletonStaticBlock2);
    }
    
    private static void testSingletonEager() {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        
        log(singletonEager1 == singletonEager2);
        log(singletonEager1);
        log(singletonEager2);
    }
}
