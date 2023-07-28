package com.enh.streams.exercises.prudhvi;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;

import java.util.stream.Collectors;

public class StreamsEx5 {

//    Sorting:
public static void main(String[] args) {
//    a. Given a list of strings, sort them in alphabetical order and print the sorted list.
    System.out.println(
            StreamUtils.strings().stream()
                    .sorted()
                    .collect(Collectors.toList())
    );

//    b. Given a list of integers, sort them in descending order and print the sorted list.
    System.out.println(
            StreamUtils.getRandomIntegers().stream()
                    .sorted().collect(Collectors.toList())
    );

//    c. Given a list of Person objects, sort them based on a specific property and print the sorted list.
    System.out.println(
            StreamUtils.createPersons().stream()
                    .sorted((a,b) -> Integer.compare(a.getAge(), b.getAge()))
                    .collect(Collectors.toList())
    );
}
}
