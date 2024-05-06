package com.enh.java.streams.exercises.akshith.advanced;

import com.enh.java.streams.StreamUtils;
import com.enh.java.streams.data.Employee;
import com.enh.java.streams.data.Product;

import java.util.Comparator;

import static java.util.stream.Collectors.*;

//        Advanced Filtering and Transformation:
public class StreamsEx1 {

    public static void main(String[] args) {
//        Given a list of products, filter out the top 2 most expensive products for each category.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, 
                                collectingAndThen(toList(), 
                                        products -> products.stream()
                                                .sorted(Comparator.comparing(Product::getPrice).reversed())
                                                .limit(2)
//                                                .sorted(Comparator.comparing(Product::getPrice)) // Ascending Order
                                                .map(Product::getPrice)
//                                                .map(p -> p.getName() + " : " + p.getPrice())  // to view data in a better way
                                                .collect(toList()))))
                        
        );
        
//        Find all products which are sellable & concatenate the product codes into a single string.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(Product::isSellable)
                        .map(Product::getCode)
                        .collect(joining(", "))
        );
        
//        Group the employees by their role -> no. of employees        
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .collect(groupingBy(Employee::getRole, 
                                mapping(Employee::getName, counting())))
        );
        
//        Group the employees by their department -> employees
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .collect(groupingBy(Employee::getDepartments, 
                                mapping(Employee::getName, toList())))
        );
    }
}
