package com.enh.streams.exercises.akshith.intermediate;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Employee;
import com.enh.streams.data.Product;
import com.enh.streams.enums.Brand;

import java.util.Comparator;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

//        Combining Operations
public class StreamsEx4 {

    public static void main(String[] args) {
//        Find the top 3 products with the highest ratings and sort them by price.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .sorted(comparingInt(Product::getSold).reversed())
                        .limit(3)
                        .sorted(comparing(Product::getPrice).reversed())
                        .map(Product::getPrice)
//                        .map(Product::getCode)
                        .collect(toList())
        );
        
//        Calculate the total revenue for a specific category, considering only products with positive reviews.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(p -> p.getBrand() == Brand.SAMSUNG) // specific Brand/Category
                        .filter(p -> p.getSold() >= 5) // +ve reviews
                        .mapToInt(p -> p.getPrice().intValue() * p.getSold())
                        .sum()                 
        );
        
//        Find the product with the highest sales within a specific price range.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(p -> (p.getPrice().intValue() >= 1_00_000) && (p.getPrice().intValue() <= 1_50_000))
                        .collect(maxBy(comparingInt(Product::getSold)))
                        .map(Product::getSold)
        );
        
//        Group products by brand and then sort each group by the number of units sold.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, 
                                mapping(Product::getSold, 
                                        collectingAndThen(toList(), 
                                                productsSold -> productsSold.stream()
                                                        .sorted(comparingInt(Integer::intValue))
                                                        .collect(toList())))))
        );
        
//        Given a collection of employees, sort them by role & give employees names in sorted order
        // a.
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .collect(groupingBy(Employee::getRole, 
                                collectingAndThen(mapping(Employee::getName, toList()), 
                                        n -> n.stream()
                                                .sorted(comparing(String::valueOf))
                                                .collect(toList()))))
        );
        
        // b.
        System.out.println(
                StreamUtils.getEmployees().stream()
                        .collect(groupingBy(Employee::getRole, 
                                mapping(Employee::getName, 
                                        collectingAndThen(toList(), n -> n.stream()
                                                .sorted(Comparator.comparing(String::valueOf))
                                                .collect(toList())))))
        );
        
//        Filter out products with low inventory, sort them by price, and return the top 2 products.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(p -> !p.isSellable())
                        .sorted(comparing(Product::getPrice))
                        .limit(2)
                        .map(Product::getPrice)
                        .collect(toList())
        );
    }
}
