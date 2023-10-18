package com.enh.streams.exercises.prudhvi.intermediate;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;
import com.enh.streams.exercises.prudhvi.PersonCollector;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsEx2 {
//    Custom Stream Operations:
public static void main(String[] args) {
//    a. Implement a custom stream operation that filters elements based on multiple conditions (e.g., age > 30 and name starts with 'A').
    System.out.println(
            StreamUtils.createPersons().stream()
                    .filter(P -> (P.getAge() > 30) & (P.getName().startsWith("A")))
                    .collect(Collectors.toList())
    );

//    b. Implement a custom stream collector to accumulate objects into a specific data structure or format.
    System.out.println(
            StreamUtils.createPersons().stream()
                    .collect(new PersonCollector())
    );
}
}
