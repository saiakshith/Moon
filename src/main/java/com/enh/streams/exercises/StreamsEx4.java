package com.enh.streams.exercises;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;

import java.util.Comparator;
import java.util.stream.Collectors;

//    Sorting and Grouping:
public class StreamsEx4 {
    public static void main(String[] args) {
//    a. Sort a list of strings in alphabetical order using streams.
        System.out.println(
                StreamUtils.createPersons().stream()
                        .map(Person::getName)
                        .sorted()
                        .collect(Collectors.toList())
        );

//    b. Group a list of people by their age using Collectors.groupingBy.
        System.out.println(
                StreamUtils.createPersons().stream()
                        .collect(Collectors.groupingBy(Person::getAge))
        );

//    c. Find the oldest person in a list of Person objects.
        System.out.println(
                StreamUtils.createPersons().stream()
                        .max(Comparator.comparingInt(Person::getAge))
        );
    }
}
