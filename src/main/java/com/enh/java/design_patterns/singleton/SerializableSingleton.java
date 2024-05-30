package com.enh.java.design_patterns.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
//    private static final long serialVersionUID = -7604766932017737115L;

    private SerializableSingleton(){}

    private static class SingletonHelper {
        private static final SerializableSingleton instance = new SerializableSingleton();
    }

    public static SerializableSingleton getInstance() {
        return SingletonHelper.instance;
    }

    public Object readResolve() {
        return getInstance();
    }
}
