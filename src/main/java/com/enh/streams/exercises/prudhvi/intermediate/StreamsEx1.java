package com.enh.streams.exercises.prudhvi.intermediate;

import com.enh.streams.StreamUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsEx1 {

//    FlatMap:
    public static void main(String[] args) {
//    a. Given a list of lists of integers, flatten it into a single list and print the result.
        System.out.println(
                StreamUtils.getOrderedIntegers().stream()
                        .flatMap(l -> l.stream())
                        .collect(Collectors.toList())
        );
//    b. Given a list of strings containing words, split each string into words and print the distinct words as a single list.
        System.out.println(
                StreamUtils.stringsContainingWords().stream()
                        .flatMap(ls -> Arrays.stream(ls.split("\\s+")))
                        .distinct()
                        .collect(Collectors.toList())
        );
    }
}
