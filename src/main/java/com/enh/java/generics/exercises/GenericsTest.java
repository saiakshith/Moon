package com.enh.java.generics.exercises;

import com.enh.java.generics.data.pojos.Customer;
import com.enh.java.generics.data.pojos.User;
import com.enh.java.generics.util.CollectionUtil;

import java.util.ArrayList;
import java.util.List;

class GenericsTest {
    
    public static void log(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        
        
        List<User> customers = new ArrayList<>();
//        List<Principal> customers = new ArrayList<>();
//        customers.add(new Principal("Ravi"));
//        customers.add(new User("Pavan"));
        customers.add(new User("Barani"));
        customers.add(new Customer("Akshith"));
        
        CollectionUtil<User> collectionUtil = new CollectionUtil();
//        CollectionUtil<Principal> collectionUtil = new CollectionUtil();
        log(collectionUtil.sort(customers));
    }
}




