package com.enh.streams.exercises;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

//    Mapping:
public class StreamsEx2 {
    public static void main(String[] args) {
//    a. Convert a list of Person objects into a list of their corresponding names.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .map(Person::getName)
                        .collect(toList())
        );      
      
//    b. Given a list of Strings, create a new list with each string's length.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .map(Person::getName)
                        .map(String::length)
//                        .map(n -> n.split(""))
                        .map(List::of)
                        .collect(toList())
        );
        
//    c. Transform a list of integers into their squares using map operation.
        System.out.println(
                StreamUtils.getOrderedIntegers().stream()
                        .map(Math::sqrt)
                        .collect(toList())
        );
    }
}
