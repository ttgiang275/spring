package com.river;

public class Bike implements Transport {

    public Bike() {
        System.out.println("Bike created");
    }

    @Override
    public void drive() {
        System.out.println("Driving a bike");
    }
}
