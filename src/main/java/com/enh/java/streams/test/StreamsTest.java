package com.enh.java.streams.test;

import com.enh.java.streams.builders.ProductBuilder;
import com.enh.java.streams.data.Product;
import com.enh.java.streams.enums.ProductType;

public class StreamsTest {
    
    private static void log(final Object object) {
        System.out.println(object);
    }
    
    public static void main(String[] args) {
        Product product = ProductBuilder.withCode("productCode")
                .withType(ProductType.MOBLIE)
                .build();
        
        log(product);
    }
}
