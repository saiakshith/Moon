package com.enh.java.design_patterns.factory.example.specific.factory;

import com.enh.java.design_patterns.factory.example.specific.Bus;
import com.enh.java.design_patterns.factory.example.specific.Vehicle;

public class BusFactory implements VehicleFactory {
    @Override
    public Vehicle factoryMethod() {
        return new Bus();
    }
}
