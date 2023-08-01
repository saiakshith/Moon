package com.enh.streams.exercises.akshith.intermediate;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Product;
import com.enh.streams.enums.Brand;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//        Combining Operations
public class StreamsEx4 {

    public static void main(String[] args) {
//        Find the top 3 products with the highest ratings and sort them by price.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .sorted(Comparator.comparingInt(Product::getSold).reversed())
                        .limit(3)
                        .sorted(Comparator.comparing(Product::getPrice).reversed())
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
                        .collect(maxBy(Comparator.comparingInt(Product::getSold)))
                        .map(Product::getSold)
        );
        
//        Group products by brand and then sort each group by the number of units sold.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, 
                                mapping(Product::getSold, 
                                        collectingAndThen(toList(), 
                                                productsSold -> productsSold.stream()
                                                        .sorted(Comparator.comparingInt(Integer::intValue))
                                                        .collect(toList())))))
        );
        
//        Filter out products with low inventory, sort them by price, and return the top 2 products.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(p -> !p.isSellable())
                        .sorted(Comparator.comparing(Product::getPrice))
                        .limit(2)
                        .map(Product::getPrice)
                        .collect(toList())
        );
    }
}
