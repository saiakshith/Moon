package com.enh.java.streams.exercises.akshith.intermediate;

import com.enh.java.streams.StreamUtils;
import com.enh.java.streams.data.Product;

import java.math.BigDecimal;
import java.util.Comparator;

import static java.util.stream.Collectors.*;

//Reduction and Aggregation
public class StreamsEx3 {
    
    public static void main(String[] args) {
//        Calculate the total revenue generated from all the products using streams.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .map(p -> p.getPrice().multiply(new BigDecimal(p.getSold())))
                        .collect(toList())
        );
        
//        Find the product with the highest price.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(maxBy(Comparator.comparing(Product::getPrice)))
        );
        
//        Sum the total price of all products in stock.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(Product::isSellable)
                        .map(p -> p.getPrice().intValue())
//                        .map(Product::getPrice)
//                        .map(BigDecimal::intValue)
                        .mapToInt(p -> p)
                        .sum()
        );
        
//        Find the average of product prices across all products.
        System.out.println(
                StreamUtils.getProducts().stream()
//                        .map(p -> p.getPrice().intValue())
                        .map(Product::getPrice)
                        .mapToInt(BigDecimal::intValue)
                        .sum() / StreamUtils.getProducts().size()
        );
        
//        Find the average of product prices for products in-stock & out-of-stock
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(partitioningBy(Product::isSellable, mapping(Product::getPrice, averagingInt(BigDecimal::intValue))))
        );
        
//        Calculate the total number of units sold for a specific brand.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, mapping(Product::getSold, summingInt(s -> s))))
        );
    }
}
