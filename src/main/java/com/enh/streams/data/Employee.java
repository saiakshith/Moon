package com.enh.streams.data;

import com.enh.streams.enums.Gender;

import java.math.BigDecimal;
import java.util.List;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String role;
    private BigDecimal salary;
    private Gender gender;
    private List<String> departments;
    private boolean isAdmin;

    public Employee(String id, String name, int age, String role, BigDecimal salary, Gender gender, List<String> departments, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.gender = gender;
        this.departments = departments;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", departments=" + departments +
                ", isAdmin=" + isAdmin +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
