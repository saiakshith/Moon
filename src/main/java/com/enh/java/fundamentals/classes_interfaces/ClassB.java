package com.enh.java.fundamentals.classes_interfaces;

import java.util.Collections;
import java.util.List;

public class ClassB {
    protected void returnVoid() {
        System.out.println("returnVoid ClassB");
    }

    void returnVoidWithParams(String s, int i) {
        System.out.println("returnVoidWithParams ClassB");
    }

    public String returnString() {
        System.out.println("returnString ClassB");
        
        return "returnString";
    }

    public String returnStringWithParams(String s, int i) {
        System.out.println("returnStringWithParams ClassB");
        
        return "returnStringWithParams";
    }

    public List<String> returnList() {
        System.out.println("returnList ClassB");
        
        return Collections.emptyList();
    }

    public List<String> returnListWithParams(List<String> strings) {
        System.out.println("returnListWithParams ClassB");
        
        return Collections.emptyList();
    }
}
