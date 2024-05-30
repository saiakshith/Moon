package com.enh.java.design_patterns.factory.example.generic.factory.impl;

import com.enh.java.design_patterns.factory.example.generic.Product;
import com.enh.java.design_patterns.factory.example.generic.ProductA;
import com.enh.java.design_patterns.factory.example.generic.factory.ProductFactory;

public class ProductAFactoryImpl implements ProductFactory {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}
