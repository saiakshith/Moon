package com.enh.streams.exercises.prudhvi.beginner;

import com.enh.streams.StreamUtils;

import java.util.stream.Collectors;

public class StreamsEx5 {
//    Chaining:
    public static void main(String[] args) {
//    a. Given a list of strings, filter out the ones that contain a specific character, convert them to uppercase, and then print the result.
        System.out.println(
                StreamUtils.strings().stream()
                        .filter(sc -> sc.contains("B"))
                        .map(i -> i.toUpperCase())
                        .collect(Collectors.toList())
        );
//    b. Given a list of integers, filter out the odd numbers, double the even numbers, and then print the resulting list.
        System.out.println(
                StreamUtils.getOrderedNumbers()
                        .stream()
                        .filter(en -> en%2 == 0)
                        .map(d -> d * d)
                        .collect(Collectors.toList())
        );

    }
}
