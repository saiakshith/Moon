package com.enh.java.playground.test;

import com.enh.java.playground.Account;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class PlaygroundTest {
    
    public static void log(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) {

        List<String> superList = List.of("sai", "ravi", "akhil");
        List<String> subList1 = List.of("sai", "ravi");
        List<String> subList2 = List.of("sai", "veera");
        
        log(superList.contains("sai"));
        log(superList.containsAll(subList1));
        log(superList.containsAll(subList2));
    }
}

class PlaygroundTest2 {
    
}
