package com.enh.java.design_patterns.factory.example.specific.factory;

import com.enh.java.design_patterns.factory.example.specific.Car;
import com.enh.java.design_patterns.factory.example.specific.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle factoryMethod() {
        return new Car();
    }
}
