package com.enh.java.design_patterns.singleton;

public class SingletonStaticBlock {
    
    private static SingletonStaticBlock singletonStaticBlock;
    
    static {
        singletonStaticBlock = new SingletonStaticBlock();
    }
    
    private SingletonStaticBlock() {}
    
    public static SingletonStaticBlock getInstance() {
        return singletonStaticBlock;
    }
}
