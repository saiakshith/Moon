package com.enh.java.design_patterns.singleton;

import java.util.Objects;

public class SingletonLazy {
    
    private static SingletonLazy singletonLazy;
    private SingletonLazy() {}

    {
        singletonLazy = new SingletonLazy();
    }
    
    public static SingletonLazy getInstance() {
        return Objects.nonNull(singletonLazy) ? singletonLazy : new SingletonLazy();
    }
}
