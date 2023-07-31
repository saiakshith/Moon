package com.enh.streams.exercises.akshith.beginner;

import com.enh.streams.StreamUtils;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

//    FlatMap
public class StreamsEx7 {

    public static void main(String[] args) {
//    a. Given a list of lists of integers, flatten it into a single list of integers.
        System.out.println(
                StreamUtils.getOrderedIntegers().stream()
                        .map(i -> List.of(i + 1, i - 1))
                        .flatMap(li -> li.stream())
//                        .filter(i -> i >= 0)
//                        .sorted()
                        .collect(toList())
        );
        
//    b. Convert a list of sentences into a list of words using flatMap.
        System.out.println(
                StreamUtils.getSentencesList().stream()
                        .flatMap(s -> Arrays.stream(s.split(" ")))
                        .collect(toList())
        );
    }
}
