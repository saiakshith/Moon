package com.enh.java.design_patterns.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;
    
    private ThreadSafeSingleton() {}
    
    public static synchronized ThreadSafeSingleton getInstance() {
        if (Objects.isNull(threadSafeSingleton)) {
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        
        return threadSafeSingleton;
    }
}
