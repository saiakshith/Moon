package com.enh.streams.exercises.prudhvi.intermediate;

import com.enh.streams.StreamUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsEx1 {

    public static void main(String[] args) {
//  ###  FlatMap:
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
//    ###    Parallel Streams:
//        a. Given a large list of integers, find the sum of all the numbers using parallel streams and compare the performance with sequential streams.
        long startTime = System.currentTimeMillis();
        System.out.println(
                StreamUtils.getOrderedNumbers().parallelStream()
                        .mapToInt(Integer::intValue)
                        .sum()
        );
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel Time : " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(
                StreamUtils.getOrderedNumbers().stream()
                        .sequential()
                        .mapToInt(Integer::intValue)
                        .sum()
        );
        endTime = System.currentTimeMillis();
        System.out.println("Sequential : " + (endTime - startTime) + "ms");

//        b. Given a list of strings, perform an expensive operation on each element in parallel and print the time taken for both parallel and sequential processing.
        startTime = System.currentTimeMillis();
        StreamUtils.strings().parallelStream()
                        .forEach(s -> {
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        });
        endTime = System.currentTimeMillis();
        System.out.println("Parallel string time : " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StreamUtils.strings().stream()
                .sequential()
                .forEach(s -> {
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        });
        endTime = System.currentTimeMillis();
        System.out.println("Sequential string time : " + (endTime - startTime) + "ms");

    }
}
