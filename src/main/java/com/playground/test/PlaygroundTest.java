package com.playground.test;


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
        
        Instant instant = Instant.now();
        
        log(instant);
        log(LocalDateTime.now());
    }
}

