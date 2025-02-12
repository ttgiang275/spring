package com.river;

public class Car implements Transport {

    public Car () {
        System.out.println("Car created");
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
