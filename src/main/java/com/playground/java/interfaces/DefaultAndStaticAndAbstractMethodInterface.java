package com.playground.java.interfaces;

import org.apache.commons.lang3.StringUtils;

import static com.enh.java.util.PlaygroundUtil.log;

public interface DefaultAndStaticAndAbstractMethodInterface {
    
    String testAbstractMethod();
    
    default String testDefaultMethod() {
        log("Interface : Test DEFAULT Method.");
        
        return StringUtils.EMPTY;
    }
    
    static String testStaticMethod() {
        log("Interface : Test STATIC Method.");
        
        return StringUtils.EMPTY;
    }
}
