package com.enh.java.design_patterns.singleton;

public class StaticBlockSingleton {
    
    private static StaticBlockSingleton staticBlockSingleton;
    
    static {
        staticBlockSingleton = new StaticBlockSingleton();
    }
    
    private StaticBlockSingleton() {}
    
    public static StaticBlockSingleton getInstance() {
        return staticBlockSingleton;
    }
}
