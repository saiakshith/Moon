package com.enh.java.generics.data.pojos;

//public class User extends Principal implements Comparable<User>{
public class User extends Principal {
    
    private int rollNo;

    public User(String name) {
        super(name);
    }

    public User(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

//    @Override
//    public int compareTo(User o) {
//        return getName().compareTo(o.getName());
//    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + getName() + ", " +
                "rollNo=" + rollNo +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
