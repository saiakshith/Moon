package com.enh.streams.exercises.akshith.beginner;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

//    Sorting and Grouping:
public class StreamsEx4 {
    public static void main(String[] args) {
//    a. Sort a list of strings in alphabetical order using streams.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .map(Person::getName)
                        .sorted()
                        .collect(toList())
        );

//    b. Group a list of people by their age using Collectors.groupingBy.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .collect(groupingBy(Person::getAge))
        );

//    c. Find the oldest person in a list of Person objects.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .max(comparingInt(Person::getAge))
        );
    }
}
