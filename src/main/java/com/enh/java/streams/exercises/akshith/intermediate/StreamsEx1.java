package com.enh.java.streams.exercises.akshith.intermediate;

import com.enh.java.streams.StreamUtils;
import com.enh.java.streams.data.Product;

import static java.util.stream.Collectors.toList;

//    Filtering and Transformation:
public class StreamsEx1 {
    
    public static void main(String[] args) {
//    Given a list of products, filter out the ones with a price higher than a certain threshold.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(p -> p.getPrice().intValue() > 30_000)
    //                        .map(Product::getPrice)
                        .collect(toList())
        );
        
//    Find all products with a specific category using streams.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(Product::isSellable)
    //                    .map(Product::getName)
                        .collect(toList())
        );
        
//    Convert a list of product names to uppercase.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .map(Product::getName)
                        .map(String::toUpperCase)
                        .collect(toList())
        );
        
//    Filter out the products that are out of stock.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .filter(p -> !p.isSellable())
//                        .filter(p -> BooleanUtils.isFalse(p.isSellable()))
                        .collect(toList())
        );
    }
}
