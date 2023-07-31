package com.enh.streams.exercises.akshith.beginner;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Product;
import org.apache.commons.lang3.StringUtils;

//        Reduction and Aggregation:
public class StreamsEx3 {
    public static void main(String[] args) {
//        a. Find the maximum value in a list of integers using streams.
        System.out.println(
                StreamUtils.getRandomIntegers().stream()
                        .mapToInt(n -> n)
                        .max()
                        .orElse(0)
        );
        
//        b. Calculate the product of all elements in a list of doubles.
        System.out.println(
                StreamUtils.getOrderedDoubles().stream()
                        .reduce(1.0, (a, cv) -> a * cv)
        );
        
//        c. Concatenate a list of strings using reduce operation.
        System.out.println(
                StreamUtils.getStringsList().stream()
                        .filter(StringUtils::isNoneBlank)
                        .reduce("", String::concat)
        );
        
//        d. Count the number of occurrences of a specific word in a list of strings.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .map(Product::getDescription)
                        .filter(d -> d.contains("galaxy"))
                        .count()
        );
    }
}
