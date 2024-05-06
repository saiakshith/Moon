package com.enh.java.streams.exercises.akshith.intermediate;

import com.enh.java.streams.StreamUtils;
import com.enh.java.streams.data.Employee;
import com.enh.java.streams.data.Product;
import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;

import static java.util.stream.Collectors.toList;

//        Handling Null and Optional:
public class StreamsEx5 {

    public static void main(String[] args) {
//        Find all products with description, or return products without descriptions as empty Optionals.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(p -> StringUtils.isNotBlank(p.getDescription()))
                        .map(Product::getCode)
                        .collect(toList())
        );
        
//        Calculate the total revenue for products, handling discounts as Optional if available.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .mapToInt(p -> p.getPrice().intValue() * p.getSold())
                        .sum()
        );
        
//        Find all employees who are admins & sort them by no. of departments they are involved in.
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .filter(Employee::isAdmin)
                        .sorted(Comparator.comparing(e -> e.getDepartments().size()))
                        .map(e -> e.getName() + " : " + e.getDepartments())
                        .collect(toList())
//                        .collect(groupingBy(Employee::getName, mapping(Employee::getDepartments, toList())))
        );
    }
}
