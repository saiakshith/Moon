package com.enh.streams.exercises.akshith.intermediate;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Product;
import com.enh.streams.enums.Brand;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

// Sorting and Grouping:
public class StreamsEx2 {

    public static void main(String[] args) {
//        Sort the products by price in ascending order.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .sorted(comparing(Product::getPrice))
//                        .sorted((t, o) -> o.getPrice().compareTo(t.getPrice()))
                        .map(Product::getPrice)
                        .collect(toList())
        );
        
//        Group products by their brand and calculate the average price within each group.
        System.out.println("Map : Key -> Brand : Value -> Product");
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand))
        );
        
        // a. What if you want the "product price", but not the entire "product" itself.
        System.out.println("Map : Key -> Brand : Value -> Product prices");
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, mapping(Product::getPrice, toList())))
        );
        
        // b. What if you want the "average of product prices -> as Double" in that list, but not the "product prices list"
        System.out.println("Map : Key -> Brand : Value -> Average of product prices(Double)");
        
        Map<Brand, Double> avgOfPricesByBrand1 = StreamUtils.getProducts().stream()
                .collect(groupingBy(Product::getBrand, mapping(Product::getPrice, averagingInt(BigDecimal::intValue))));
        
        System.out.println(avgOfPricesByBrand1);
        
        // c. What if you want the "average of product prices -> as BigDecimal" in that list.
        System.out.println("Map : Key -> Brand : Value -> Average of product prices(BigDecimal)");
        
        Map<Brand, BigDecimal> avgOfPricesByBrand2 = StreamUtils.getProducts().stream()
                .collect(groupingBy(Product::getBrand,
                        mapping(Product::getPrice,
                                collectingAndThen(averagingInt(BigDecimal::intValue), 
                                        (p) -> new BigDecimal(p).setScale(2, RoundingMode.HALF_UP)))));
        
        System.out.println(avgOfPricesByBrand2);
        
//        Sort the products by their availability and then by price in ascending order.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .sorted(Comparator.comparing(Product::isSellable)) // this is useless
                        .sorted(Comparator.comparing(Product::getPrice))
//                        .map(Product::getPrice)
                        .collect(toList())
        );
        
//        Group products by brand and count the number of products in each category.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, counting()))
        );
        
//        Sort the products by price in descending order.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .sorted((t, o) -> o.getPrice().compareTo(t.getPrice()))
//                        .sorted((t, o) -> o.toString().compareTo(t.toString()))
//                        .map(Product::getPrice)
//                        .map(Product::getBrand)
                        .collect(toList())
        );
    }
}
