package com.enh.java.design_patterns.singleton;

import java.util.Objects;

public class DoubleCheckedLockingThreadSafeSingleton {
    private static DoubleCheckedLockingThreadSafeSingleton doubleCheckedLockingThreadSafeSingleton;
    
    private DoubleCheckedLockingThreadSafeSingleton() {}
    
    public static DoubleCheckedLockingThreadSafeSingleton getInstance() {
//        if (Objects.isNull(doubleCheckedLockingThreadSafeSingleton)) {
            synchronized (DoubleCheckedLockingThreadSafeSingleton.class) {
                if (Objects.isNull(doubleCheckedLockingThreadSafeSingleton)) {
                    doubleCheckedLockingThreadSafeSingleton = new DoubleCheckedLockingThreadSafeSingleton();
                }
            }
//        }
        
        return doubleCheckedLockingThreadSafeSingleton;
    }
}
