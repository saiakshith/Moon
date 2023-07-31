package com.enh.streams.exercises.akhil.beginner;

import com.enh.streams.StreamUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//       Stream Creation and Intermediate Operations
public class StreamsEx1 {

    public static void main(String[] args) {

        //    How do you create a Stream from a List of integer

        System.out.println(
                List.of(1, 2, 3, 4, 5).stream()
        );

        //    Use a Stream to filter out even numbers from a List of integers.
        System.out.println(
                StreamUtils.getRandomIntegers().stream()
                        .filter(i -> i % 2 == 0)
                        .collect(Collectors.toList())
        );

        //    Given a List of strings, use a Stream to convert all elements to uppercase.
        System.out.println(
                StreamUtils.getStringsList().stream()
                        .filter(StringUtils::isNotBlank)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList())
        );

        //    Write a Stream to extract distinct elements from an array of integers.
        System.out.println(
                StreamUtils.getRandomIntegers().stream()
                        .distinct()
                        .collect(Collectors.toList())
        );

        //    Given a Stream of strings, filter out strings with length less than 5 characters.
        System.out.println(
                StreamUtils.getStringsList().stream()
                        .filter(StringUtils::isNotBlank)
                        .filter(s -> s.length() <= 5)
                        .collect(Collectors.toList())
        );

    }
}
