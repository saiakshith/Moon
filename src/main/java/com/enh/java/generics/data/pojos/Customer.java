package com.enh.java.generics.data.pojos;

public class Customer extends User {
    public Customer(String name) {
        super(name);
    }

    public Customer(String name, int rollNo) {
        super(name, rollNo);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name=" + getName() + ", " +
                "rollNo=" + getRollNo() +
                "}";
    }
}
