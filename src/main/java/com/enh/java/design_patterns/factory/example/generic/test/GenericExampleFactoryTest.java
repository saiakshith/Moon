package com.enh.java.design_patterns.factory.example.generic.test;

import com.enh.java.design_patterns.factory.example.generic.Product;
import com.enh.java.design_patterns.factory.example.generic.factory.AbstractProductCreatorFactory;
import com.enh.java.design_patterns.factory.example.generic.factory.ProductCreatorFactory;
import com.enh.java.design_patterns.factory.example.generic.factory.abstract_class_impl.ProductAAbstractCreatorFactoryImpl;
import com.enh.java.design_patterns.factory.example.generic.factory.abstract_class_impl.ProductBAbstractCreatorFactoryImpl;
import com.enh.java.design_patterns.factory.example.generic.factory.impl.ProductACreatorFactoryImpl;
import com.enh.java.design_patterns.factory.example.generic.factory.impl.ProductBCreatorFactoryImpl;

public class GenericExampleFactoryTest {
    public static void main(String[] args) {
//        testAbstracProductFactory();
        testProductFactory();
    }
    
    static void testProductFactory() {
        ProductCreatorFactory productAFactory = new ProductACreatorFactoryImpl();
        Product productA = productAFactory.factoryMethod();

        ProductCreatorFactory productBFactory = new ProductBCreatorFactoryImpl();
        Product productB = productBFactory.factoryMethod();

        productA.display();
        productB.display();
    }
    
    
    static void testAbstracProductFactory() {
        AbstractProductCreatorFactory productAFactory = new ProductAAbstractCreatorFactoryImpl();
        Product productA = productAFactory.factoryMethod();

        AbstractProductCreatorFactory productBFactory = new ProductBAbstractCreatorFactoryImpl();
        Product productB = productBFactory.factoryMethod();

        productA.display();
        productB.display();
    }
}
