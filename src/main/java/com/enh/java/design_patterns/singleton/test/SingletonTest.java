package com.enh.java.design_patterns.singleton.test;

import com.enh.java.design_patterns.singleton.BillPughSingleton;
import com.enh.java.design_patterns.singleton.DoubleCheckedLockingThreadSafeSingleton;
import com.enh.java.design_patterns.singleton.EagerSingleton;
import com.enh.java.design_patterns.singleton.LazySingleton;
import com.enh.java.design_patterns.singleton.StaticBlockSingleton;
import com.enh.java.design_patterns.singleton.ThreadSafeSingleton;

public class SingletonTest {
    
    public static void log(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) {
//        testSingletonEager();
//        testSingletonStaticBlock();
//        testSingletonLazy();
//        testThreadSafeSingleton();
//        testDoubleCheckedLockingThreadSafeSingleton();
        testBillPughSingleton();
    }
    
    private static void testBillPughSingleton() {
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        
        log(billPughSingleton1 == billPughSingleton2);
        log(billPughSingleton1);
        log(billPughSingleton2);
    }

    private static void testDoubleCheckedLockingThreadSafeSingleton() {
        DoubleCheckedLockingThreadSafeSingleton doubleCheckedLockingThreadSafeSingleton1 = DoubleCheckedLockingThreadSafeSingleton.getInstance();
        DoubleCheckedLockingThreadSafeSingleton doubleCheckedLockingThreadSafeSingleton2 = DoubleCheckedLockingThreadSafeSingleton.getInstance();
        
        log(doubleCheckedLockingThreadSafeSingleton1 == doubleCheckedLockingThreadSafeSingleton2);
        log(doubleCheckedLockingThreadSafeSingleton1);
        log(doubleCheckedLockingThreadSafeSingleton2);
    }
    
    private static void testThreadSafeSingleton() {
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        
        log(threadSafeSingleton1 == threadSafeSingleton2);
        log(threadSafeSingleton1);
        log(threadSafeSingleton2);
    }
    
    private static void testSingletonLazy() {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        
        log(lazySingleton1 == lazySingleton2);
        log(lazySingleton1);
        log(lazySingleton2);
    }
    
    private static void testSingletonStaticBlock() {
        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();

        log(staticBlockSingleton1 == staticBlockSingleton2);
        log(staticBlockSingleton1);
        log(staticBlockSingleton2);
    }
    
    private static void testSingletonEager() {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        
        log(eagerSingleton1 == eagerSingleton2);
        log(eagerSingleton1);
        log(eagerSingleton2);
    }
}
