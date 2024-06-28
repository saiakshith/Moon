package com.playground;


import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class PlaygroundTest {
    
    public static void log(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) {

        List<String> superList = List.of("sai", "ravi", "akhil");
        List<String> subList1 = List.of("sai", "ravi");
        List<String> subList2 = List.of("sai", "veera");

        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("name", "person");
        
        Instant instant = Instant.now();
        
        log(instant);
        log(LocalDateTime.now());
    }
}

class PlaygroundTest2 {
    
}
