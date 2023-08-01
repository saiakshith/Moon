package com.enh.streams.exercises.akshith.advanced;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Product;
import com.enh.streams.enums.Arrival;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

//        Advanced Sorting and Grouping
public class StreamsEx2 {

    public static void main(String[] args) {
//        Group products by their brand and sort each group by their popularity based on views and purchases.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getBrand, 
                                        collectingAndThen(mapping(Product::getSold, toList()), 
                                                sold -> sold.stream().sorted().collect(toList()))))
        );
        
//        Group products by their arrival & stock
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(partitioningBy(p -> (p.getArrival() == Arrival.NEW && p.isSellable()), 
                                mapping(p -> p.getName() + " : " + p.getArrival().name() + " : " + p.isSellable(), toList())))
        );
        
//        Sort products based on how many sold, considering user ratings.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .sorted(comparing(Product::getSold))
                        .sorted(comparing(Product::getRatings))
                        .map(p -> "Sold : " +p.getSold() + " - " + "Rating : " + p.getRatings())
                        .collect(toList())
        );
        
//        Group products by payment method and calculate the average product price for each payment method.
        System.out.println(
                StreamUtils.getProducts().stream()
                        .collect(groupingBy(Product::getPaymentMode, 
//                                mapping(Product::getPrice, toList())))
                                mapping(Product::getPrice, averagingInt(BigDecimal::intValue))))
        );
    }
}
