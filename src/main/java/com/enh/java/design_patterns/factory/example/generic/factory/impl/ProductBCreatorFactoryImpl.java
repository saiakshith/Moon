package com.enh.java.design_patterns.factory.example.generic.factory.impl;

import com.enh.java.design_patterns.factory.example.generic.Product;
import com.enh.java.design_patterns.factory.example.generic.ConcreteProductB;
import com.enh.java.design_patterns.factory.example.generic.factory.ProductCreatorFactory;

public class ProductBCreatorFactoryImpl implements ProductCreatorFactory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
