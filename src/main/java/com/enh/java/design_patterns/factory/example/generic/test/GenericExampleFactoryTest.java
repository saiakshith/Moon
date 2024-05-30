package com.enh.java.design_patterns.factory.example.generic.test;

import com.enh.java.design_patterns.factory.example.generic.Product;
import com.enh.java.design_patterns.factory.example.generic.factory.AbstractProductFactory;
import com.enh.java.design_patterns.factory.example.generic.factory.ProductFactory;
import com.enh.java.design_patterns.factory.example.generic.factory.abstract_class_impl.ProductAAbstractFactoryImpl;
import com.enh.java.design_patterns.factory.example.generic.factory.abstract_class_impl.ProductBAbstractFactoryImpl;
import com.enh.java.design_patterns.factory.example.generic.factory.impl.ProductAFactoryImpl;
import com.enh.java.design_patterns.factory.example.generic.factory.impl.ProductBFactoryImpl;

public class GenericExampleFactoryTest {
    public static void main(String[] args) {
//        testAbstracProductFactory();
        testProductFactory();
    }
    
    static void testProductFactory() {
        ProductFactory abstractProductFactoryProductA = new ProductAFactoryImpl();
        Product productA = abstractProductFactoryProductA.factoryMethod();

        ProductFactory abstractProductFactoryProductB = new ProductBFactoryImpl();
        Product productB = abstractProductFactoryProductB.factoryMethod();

        productA.display();
        productB.display();
    }
    
    
    static void testAbstracProductFactory() {
        AbstractProductFactory abstractProductFactoryProductA = new ProductAAbstractFactoryImpl();
        Product productA = abstractProductFactoryProductA.factoryMethod();

        AbstractProductFactory abstractProductFactoryProductB = new ProductBAbstractFactoryImpl();
        Product productB = abstractProductFactoryProductB.factoryMethod();

        productA.display();
        productB.display();
    }
}
