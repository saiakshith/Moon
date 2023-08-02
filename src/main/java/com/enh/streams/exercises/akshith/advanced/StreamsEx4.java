package com.enh.streams.exercises.akshith.advanced;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Employee;
import com.enh.streams.enums.Gender;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamsEx4 {
    
    public static void main(String[] args) {
//        Given a list of Person objects, find the oldest male and female persons by role.
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .collect(groupingBy(Employee::getRole,
                                teeing(collectingAndThen(toList(), (List<Employee> employees) -> employees.stream()
                                                        .filter(e -> e.getGender() == Gender.MALE)
                                                        .sorted(Comparator.comparing(Employee::getAge).reversed())
                                                        .limit(1)
                                                        .map(Employee::getAge)
                                                        .collect(toList())),
                                        collectingAndThen(toList(), (List<Employee> employees) -> employees.stream()
                                                        .filter(e -> e.getGender() == Gender.FEMALE)
                                                        .sorted(Comparator.comparing(Employee::getAge).reversed())
                                                        .limit(1)
                                                        .map(Employee::getAge)
                                                        .collect(toList())), 
                                        (m, f) -> Stream.of(m, f)
                                                .flatMap(l -> l.stream())
                                                .collect(toList()))))
//                                        (List<Employee> males, List<Employee> females) -> males.addAll(females))))
        );

//        Given a list of Employee objects, calculate the average salary of employees who have positive performance reviews (rating greater than 5.0).
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .filter(e -> e.getRating() > 5)
                        .collect(mapping(Employee::getSalary, averagingInt(BigDecimal::intValue)))
        );

//        Given a list of Employee objects, count the total number of employees in each department.
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .collect(groupingBy(Employee::getRole, counting()))
        );
    }
}
