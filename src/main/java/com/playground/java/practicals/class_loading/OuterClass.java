package com.playground.java.practicals.class_loading;

import org.apache.commons.lang3.StringUtils;

import static com.enh.java.util.PlaygroundUtil.log;

public class OuterClass {
    static {
        log("Outer class loaded : In the STATIC BLOCK.");
    }

    {
        log("Outer class loaded : In the INSTANCE BLOCK.");
    }
    
    public static String staticMethod() {
        return StringUtils.EMPTY;
    }
    
    public String instanceMethod() {
        return StringUtils.EMPTY;
    }

    public static class InnerStaticClass {
        private static InnerStaticClass innerStaticClass;
        
        static {
            log("Inner STATIC CLASS loaded : In the STATIC BLOCK.");
        }

        {
            log("Inner STATIC CLASS loaded : In the INSTANCE BLOCK.");
        }
        
        /*private InnerStaticClass() {}
        
        public static InnerStaticClass getInstance() {
            if (Objects.isNull(innerStaticClass)) {
                innerStaticClass = new InnerStaticClass();
            }
            
            return innerStaticClass; 
        }*/
        
        public static int staticCountVariable = 1;
        public int instanceCountVariable = 1;

        public static String innerStaticClassStaticMethod() {
            log(staticCountVariable++);
            return StringUtils.EMPTY;
        }

        public String innerStaticClassInstanceMethod() {
            log(instanceCountVariable++);
            return StringUtils.EMPTY;
        }
    }
}
