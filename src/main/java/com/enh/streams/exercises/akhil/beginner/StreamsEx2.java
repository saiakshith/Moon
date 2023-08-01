package com.enh.streams.exercises.akhil.beginner;

import com.enh.streams.StreamUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;

//        Terminal Operations

public class StreamsEx2 {
    public static void main(String[] args) {

        //        Use a Stream to find the sum of all elements in a List of integers.
        System.out.println(
                StreamUtils.getRandomIntegers().stream()
                        .mapToInt(Integer::intValue)
                        .sum()
        );

       //        Write a Stream to find the maximum value in an array of integers.
        System.out.println(
                StreamUtils.getRandomIntegers().stream()
                        .mapToInt(Integer::intValue)
                        .max()
        );

        //        Given a Stream of strings, concatenate all elements into a single string.
        System.out.println(
                StreamUtils.getStreamOfStrings().stream()
                        .filter(StringUtils::isNoneBlank)
                        .reduce("",String::concat)
        );
        //        Calculate the average of a List of doubles using Streams.
        System.out.println(
                StreamUtils.getRandomDoubles()
                        .stream().mapToDouble(d -> d)
                        .sum() / StreamUtils.getRandomDoubles().size()
        );
        //        Use a Stream to check if a List of strings contains a specific word.
        System.out.println(
                StreamUtils.getStreamOfStrings().stream()
                        .filter(s -> s.contains("B2B"))
                        .collect(Collectors.toList())
        );
    }
}
