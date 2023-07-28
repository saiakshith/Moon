package com.enh.streams.exercises.prudhvi;

import com.enh.streams.StreamUtils;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class StreamsEx6 {

//    Reduction:
public static void main(String[] args) {

//    a. Given a list of integers, find and print the sum of all the elements.
    System.out.println(
            StreamUtils.getOrderedNumbers().stream()
                    .mapToInt(i -> i).sum()
    );

//    b. Given a list of strings, concatenate them into a single string and print the result.
    System.out.println(
            StreamUtils.getStrings().stream()
                    .reduce("",(p,c) -> p.concat(c))
    );

//    c. Given a list of objects, find the maximum or minimum value of a specific property.
    System.out.println(
            StreamUtils.createProducts().stream()
                    .map(a -> a.getPrice())
                    .min(BigDecimal::compareTo)
                    .stream().collect(Collectors.toList())
    );

}
}
