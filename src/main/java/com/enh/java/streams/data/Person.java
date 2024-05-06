package com.enh.java.streams.data;

import com.enh.java.streams.enums.Gender;

import java.util.List;

public class Person {

    private String name;
    private int age;
    private Gender gender;
    private List<Person> friends;
    private boolean isEmployed;

    public Person(String name, int age, Gender gender, List<Person> friends, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friends = friends;
        this.isEmployed = isEmployed;
    }

    public Person(String name, int age, Gender gender, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", friends=" + friends +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }
}
