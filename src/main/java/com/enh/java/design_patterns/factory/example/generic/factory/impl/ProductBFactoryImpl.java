package com.enh.java.design_patterns.factory.example.generic.factory.impl;

import com.enh.java.design_patterns.factory.example.generic.Product;
import com.enh.java.design_patterns.factory.example.generic.ProductB;
import com.enh.java.design_patterns.factory.example.generic.factory.ProductFactory;

public class ProductBFactoryImpl implements ProductFactory {
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}
