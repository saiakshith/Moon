package com.enh.java.generics.data.pojos;

public class Principal implements Comparable<Principal> {
//public class Principal {
    
    private String name;

    public Principal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name=" + getName() +  
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Principal o) {
        return name.compareTo(o.name);
    }
}
