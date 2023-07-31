package com.enh.streams.exercises;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;

import static java.util.stream.Collectors.*;

//    Combining Operations:
public class StreamsEx5 {
    
    public static void main(String[] args) {
//    a. Given a list of strings, filter out the ones with odd length, convert them to uppercase, and then sort them.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .map(Person::getName)
                        .filter(n -> n.length() % 2 != 0)
                        .map(String::toUpperCase)
                        .sorted()
                        .collect(toList())
        );        
        
//    b. Find the sum of squares of even numbers from a list of integers.
        System.out.println(
                StreamUtils.getOrderedIntegers().stream()
                        .filter(n -> n % 2 == 0)
                        .map(n -> n * n)
                        .mapToInt(n -> n)
                        .sum()
                
        );
        
//    c. Group a list of strings by their first letter and concatenate them within each group.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .map(Person::getName)
                        .collect(groupingBy(n -> n.charAt(0), joining(", ")))
        );
    }
}
