package com.enh.java.streams.exercises.akshith.beginner;


import com.enh.java.streams.StreamUtils;
import org.apache.commons.lang3.StringUtils;

import static java.util.stream.Collectors.toList;

//    Filtering and Transformation:
public class StreamsEx1 {
    
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
                StreamUtils.getStringsListWithNull().stream()
                        .filter(StringUtils::isNoneBlank)
                        .map(String::toUpperCase)
                        .reduce("", String::concat) // identity - "", accumulator(a) - "", cs - Current String
        );
        
//    c. Find the average of a list of doubles using streams.
        System.out.println(
//                CommontUtils.getOrderedDoubles().stream()
                StreamUtils.getRandomDoubles().stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
        );
        
//    d. Given a list of strings, filter out the ones that start with a specific letter.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .filter(p -> p.getName().startsWith("T"))
//                        .map(Person::getName)
//                        .filter(n -> n.startsWith("T"))
//                        .filter(n -> !n.contains(" "))   
                        .collect(toList())
        );
    }
}
