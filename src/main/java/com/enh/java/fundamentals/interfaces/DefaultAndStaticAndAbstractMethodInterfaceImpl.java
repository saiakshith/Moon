package com.enh.java.fundamentals.interfaces;

import org.apache.commons.lang3.StringUtils;

import static com.enh.java.util.PlaygroundUtil.log;

public class DefaultAndStaticAndAbstractMethodInterfaceImpl implements DefaultAndStaticAndAbstractMethodInterface {

    public void testDotSuperOnInterface() {
        DefaultAndStaticAndAbstractMethodInterface.super.testDefaultMethod();
        DefaultAndStaticAndAbstractMethodInterface.testStaticMethod();
    }
    
    @Override
    public String testAbstractMethod() {
        log("Class : Test Interface ABSTRACT method : By default PUBLIC.");
        
        return StringUtils.EMPTY;
    }
}
