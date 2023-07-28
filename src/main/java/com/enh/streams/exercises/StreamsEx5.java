package com.enh.streams.exercises;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsEx5 {

//    Mapping:

public static void main(String[] args) {
//    a. Given a list of strings, convert all the elements to uppercase and print the result.
    System.out.println(
            StreamUtils.getStrings().stream()
                    .map(a->a.toUpperCase())
                    .collect(Collectors.toList())
    );

//    b. Given a list of integers, convert each number to its square and print the resulting list.
    System.out.println(
            StreamUtils.getOrderedNumbers().stream()
                    .map(a->a*a)
                    .collect(Collectors.toList())
    );

//    c. Given a list of objects, extract a specific property from each object and print it.
    System.out.println(
            StreamUtils.createPersons().stream()
                    .map(Person::getName)
                    .collect(Collectors.toList())
    );

}
}
