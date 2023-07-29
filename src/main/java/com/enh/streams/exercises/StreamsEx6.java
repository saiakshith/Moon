package com.enh.streams.exercises;

import com.enh.streams.StreamUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Optional;
import java.util.stream.Collectors;

//    Handling Null and Optional:
public class StreamsEx6 {
    
    public static void main(String[] args) {
//    a. Filter out null values from a list of strings using streams.
        System.out.println(
            StreamUtils.createStringsList().stream()
                    .filter(StringUtils::isNoneBlank)
                    .collect(Collectors.toList())
        );
        
//    b. Given a list of Optional objects, calculate the sum of their values if present.
        System.out.println(
                StreamUtils.createOptionalsList().stream()
                        .filter(Optional::isPresent)
                        .map(Optional::get)
                        .map(Integer.class::cast)     // (o -> (Integer)o)
                        .mapToInt(v -> v)
                        .sum()
        );
    }
}
