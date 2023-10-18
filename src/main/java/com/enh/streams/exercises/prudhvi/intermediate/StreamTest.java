package com.enh.streams.exercises.prudhvi.intermediate;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {

        System.out.println(
                IntStream.generate(() -> ThreadLocalRandom.current().nextInt(10))
                        .limit(7)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(""))
        );

        System.out.println(
                IntStream.generate(() -> new Random().nextInt(10))
                        .limit(7)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(""))
        );
    }
}
