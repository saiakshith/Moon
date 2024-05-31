package com.enh.java.design_patterns.factory.example.generic.factory.impl;

import com.enh.java.design_patterns.factory.example.generic.Product;
import com.enh.java.design_patterns.factory.example.generic.ConcreteProductA;
import com.enh.java.design_patterns.factory.example.generic.factory.ProductCreatorFactory;

public class ProductACreatorFactoryImpl implements ProductCreatorFactory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
