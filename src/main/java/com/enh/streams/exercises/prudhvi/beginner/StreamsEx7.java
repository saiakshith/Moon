package com.enh.streams.exercises.prudhvi.beginner;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Employee;

import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamsEx7 {
//    Advanced Operations:
    public static void main(String[] args) {
//    a. Given a list of strings, find the shortest and longest strings using streams.
        System.out.println(
                StreamUtils.strings().stream()
                       /* .filter(a -> a.length() <= 7 || a.length() >= 11)
                        .collect(Collectors.toList())*/
                        .max(Comparator.comparingInt(String::length)).stream()
                        .collect(Collectors.toList())
                + " " +
                        StreamUtils.strings().stream()
                                .min(Comparator.comparingInt(String::length)).stream()
                                .collect(Collectors.toList())
        );

//    b. Given a list of objects, find the average value of a specific property using streams.
        System.out.println(
                StreamUtils.createEmployees().stream()
                        .mapToInt(Employee::getAge)
                        .average().getAsDouble()
        );

//    c. Given a list of integers, check if all, any, or none of them meet a specific condition using streams.
        System.out.println(
                "all : " +
                StreamUtils.getOrderedNumbers().stream()
                        .allMatch(i -> i >= 0)
        );
  System.out.println(
          "any : " +
                        StreamUtils.getOrderedNumbers().stream()
                                .anyMatch(i -> i == 5)
        );
  System.out.println(
                "non : " +
                        StreamUtils.getOrderedNumbers().stream()
                                .noneMatch(i -> i < 0)
        );
    }
}
