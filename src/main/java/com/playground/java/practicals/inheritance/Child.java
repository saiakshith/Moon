package com.playground.java.practicals.inheritance;

import static com.enh.java.util.PlaygroundUtil.log;

public class Child extends Parent {
    public String name;
    public Child(String name) {
        super(name);
        this.name = name;
    }

    public static void main(String[] args) {
        log("name");
    }
}
