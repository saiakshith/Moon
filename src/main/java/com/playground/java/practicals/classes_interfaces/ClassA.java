package com.playground.java.practicals.classes_interfaces;

public class ClassA extends ClassB {

    @Override
//    protected String returnStringWithParams(String s, int i) {
    public String returnStringWithParams(String s, int i) {
        return s.substring(i);
    }
    
    // Overriding
//    public char returnStringWithParams(String s, String i) {
//    public char returnStringWithParams(String s, int i) {
//    protected char returnStringWithParams(int s, String i) {
//        return s.charAt(i);
//        return s.charAt(0);
//        return i.charAt(s);
//    }
}
