package com.enh.java.design_patterns.factory.example.specific.test;

import com.enh.java.design_patterns.factory.example.specific.Vehicle;
import com.enh.java.design_patterns.factory.example.specific.factory.BusFactory;
import com.enh.java.design_patterns.factory.example.specific.factory.CarFactory;
import com.enh.java.design_patterns.factory.example.specific.factory.VehicleFactory;

public class SpecificExampleFactoryTest {
    public static void main(String[] args) {
        testVehicleFactory();
    }
    
    static void testVehicleFactory() {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.factoryMethod();

        VehicleFactory busFactory = new BusFactory();
        Vehicle bus = busFactory.factoryMethod();
        
        car.display();
        bus.display();
    }
}
