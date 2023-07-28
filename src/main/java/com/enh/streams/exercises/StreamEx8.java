package com.enh.streams.exercises;

import com.enh.streams.StreamUtils;

import java.util.stream.Collectors;

public class StreamEx8 {

//    Collecting:
//    c. Given a list of custom objects, collect them into a map based on a specific property.
public static void main(String[] args) {

//    a. Given a list of strings, collect all the strings starting with a specific prefix into a new list.
    System.out.println(
            StreamUtils.strings().stream()
                    .filter(a->a.startsWith("A"))
                    .collect(Collectors.toList())
    );

//    b. Given a list of integers, collect all the even numbers into a new list.
    System.out.println(
            StreamUtils.getRandomNumbers().stream()
                    .filter(a -> a % 2 == 0)
                    .collect(Collectors.toList())
    );

}
}
