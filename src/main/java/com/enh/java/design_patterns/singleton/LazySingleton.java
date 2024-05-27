package com.enh.java.design_patterns.singleton;

import java.util.Objects;

public class LazySingleton {
    
    private static LazySingleton lazySingleton;
    private LazySingleton() {}
    
    public static LazySingleton getInstance() {
        if (Objects.isNull(lazySingleton)) {
            lazySingleton = new LazySingleton();
        }
        
        return lazySingleton;
    }
}
