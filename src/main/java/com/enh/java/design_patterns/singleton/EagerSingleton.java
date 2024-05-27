package com.enh.java.design_patterns.singleton;

public class EagerSingleton {
    
    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();
    private EagerSingleton() {}
    
    public static EagerSingleton getInstance() {
        return EAGER_SINGLETON;
    }
}
