package com.enh.streams.exercises.prudhvi;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Employee;

import java.util.stream.Collectors;

public class StreamsEx6 {
//    Grouping and Partitioning:
public static void main(String[] args) {
//    a. Given a list of objects, group them by a specific property and print the groups.
    System.out.println(
            StreamUtils.createEmployees().stream()
                    .collect(Collectors.groupingBy(Employee::getDepartments))
    );
/*    System.out.println("************");
        StreamUtils.createEmployees().stream()
            .collect(Collectors.groupingBy(Employee::getGender))
            .forEach((d,e) -> e.forEach(System.out::println));*/

//    b. Given a list of integers, partition them into two lists - even and odd.
    System.out.println(
            StreamUtils.getOrderedNumbers().stream()
                    .collect(Collectors.partitioningBy(i -> i % 2 == 0))
    );
    }
}
