package com.enh.java.design_patterns.factory.example.generic.factory.abstract_class_impl;

import com.enh.java.design_patterns.factory.example.generic.Product;
import com.enh.java.design_patterns.factory.example.generic.ConcreteProductA;
import com.enh.java.design_patterns.factory.example.generic.factory.AbstractProductCreatorFactory;

public class ProductAAbstractCreatorFactoryImpl extends AbstractProductCreatorFactory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}
