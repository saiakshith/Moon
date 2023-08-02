package com.enh.streams.exercises.akshith.advanced;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Employee;
import com.enh.streams.data.Product;
import com.enh.streams.enums.Gender;

import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//      Advanced Combining Operations
public class StreamsEx3 {

    public static void main(String[] args) {
//        Find the top 2 products with the highest revenue, considering seasonal fluctuations in sales.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(Product::isSellable)
                        .sorted(Comparator.comparing(p -> p.getPrice().intValue() * p.getSold(), Comparator.reverseOrder()))
//                        .map(p -> p.getCode() + " : " + p.getPrice() + " : " + p.getSold())
                        .collect(groupingBy(p -> p.getCode() + " : " + p.getPrice() + " : " + p.getSold(), 
                                mapping(p -> p.getPrice().intValue() * p.getSold(), toList())))
                        
        );
        
//        Group products by their brand & sort each group by their price.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, 
                                collectingAndThen(toList(), 
                                        products -> products.stream()
                                                .sorted(Comparator.comparingInt(p -> p.getPrice().intValue()))
                                                .map(p -> p.getName() + ":" + p.getPrice())
                                                .collect(toList()))))
        );

//        Given a list of Employee objects, find the employee with the highest salary in each department.
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .collect(groupingBy(Employee::getDepartments, 
                                collectingAndThen(toList(), 
                                        employees -> employees.stream()
                                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                .limit(1)
                                                .map(e -> e.getName() + ":" + e.getSalary())
                                                .collect(toList()))))
        );

//        Given a list of Employee objects, calculate the average age of female employees with a specific job title (e.g., "Software Engineer").
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .collect(groupingBy(Employee::getRole, 
                                filtering(e -> e.getGender() == Gender.FEMALE, 
                                        mapping(Employee::getAge, averagingInt(Integer::intValue)))))
        );

//        Given a list of Product objects, calculate the total revenue for each category
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, 
                                mapping(p -> p.getPrice().intValue() * p.getSold(), 
                                        summingInt(Integer::intValue))))
        );
    }
}
