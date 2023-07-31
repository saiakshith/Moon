package com.enh.streams.exercises;


import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;
import com.enh.streams.data.Product;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
                StreamUtils.getStringsList().stream()
                        .filter(StringUtils::isNoneBlank)
                        .map(String::toUpperCase)
                        .reduce("", String::concat) // identity - "", accumulator(a) - "", cs - Current String
        );
        
//    c. Find the average of a list of doubles using streams.
        System.out.println(
//                CommontUtils.getOrderedDoubles().stream()
                StreamUtils.getRandomDoubles().stream()
                        .mapToDouble(d -> d)
                        .sum() / StreamUtils.getOrderedDoubles().size()
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
