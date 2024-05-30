package com.enh.java.design_patterns.factory.example.generic.factory.abstract_class_impl;

import com.enh.java.design_patterns.factory.example.generic.Product;
import com.enh.java.design_patterns.factory.example.generic.ProductA;
import com.enh.java.design_patterns.factory.example.generic.factory.AbstractProductFactory;

public class ProductAAbstractFactoryImpl extends AbstractProductFactory {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}
