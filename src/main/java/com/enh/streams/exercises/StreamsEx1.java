package com.enh.streams.exercises;


import com.enh.streams.StreamUtils;

import java.util.stream.Collectors;

public class StreamsEx1 {

//    Filtering and Transformation:

    public static void main(String[] args) {
//    a. Given a list of integers, filter out the even numbers and find their sum.
        System.out.println(
//                CommontUtils.getOrderedNumbers().stream()
                StreamUtils.getRandomIntegers().stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(e -> e)
                        .sum()
        );
        
//    b. Convert a list of strings to uppercase and concatenate them into a single string.
        System.out.println(
                StreamUtils.getStrings().stream()
                        .map(s -> s.toUpperCase())
                        .reduce("", (a, cs) -> a.concat(cs)) // a - "", cs - Current String
        );
        
//    c. Find the average of a list of doubles using streams.
        System.out.println(
//                CommontUtils.getOrderedDoubles().stream()
                StreamUtils.getRandomDoubles().stream()
                        .mapToDouble(d -> d)
                        .sum() / StreamUtils.getOrderedDoubles().size()
        );

        System.out.println(
                StreamUtils.createProducts().stream()
                        .map(p -> p.getPrice())
                        .mapToInt(price -> price.intValue())
                        .sum()
        );
        
//    d. Given a list of strings, filter out the ones that start with a specific letter.
        System.out.println(
                StreamUtils.createPersons().stream()
                        .filter(p -> p.getName().startsWith("T"))
//                        .map(p -> p.getName())
//                        .filter(n -> n.startsWith("T"))
//                        .filter(n -> !n.contains(" "))   
                        .collect(Collectors.toList())
        );
    }
}
