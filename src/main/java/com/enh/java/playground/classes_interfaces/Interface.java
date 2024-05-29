package com.enh.java.playground.classes_interfaces;

import java.util.List;

public interface Interface {
    void returnVoid();
    
    void returnVoidWithParams(String s, int i);
    
    String returnString();
    
    String returnStringWithParams(String s, int i);
    
    List<String> returnList();
    
    List<String> returnListWithParams(List<String> strings);
}
