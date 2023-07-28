package com.enh.streams.exercises.prudhvi;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;

import java.util.List;
import java.util.stream.Collectors;

//    Mapping:
public class StreamsEx2 {
    public static void main(String[] args) {
//    a. Convert a list of Person objects into a list of their corresponding names.
        System.out.println(
                StreamUtils.createPersons().stream()
                        .map(Person::getName)
                        .collect(Collectors.toList())
        );      
      
//    b. Given a list of Strings, create a new list with each string's length.
        System.out.println(
                StreamUtils.createPersons().stream()
                        .map(Person::getName)
                        .map(String::length)
//                        .map(n -> n.split(""))
                        .map(List::of)
                        .collect(Collectors.toList())
        );
        
//    c. Transform a list of integers into their squares using map operation.
        System.out.println(
                StreamUtils.getOrderedNumbers().stream()
                        .map(Math::sqrt)
                        .collect(Collectors.toList())
        );
    }
}
