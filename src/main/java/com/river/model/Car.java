package com.river.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Transport {

    public Car () {
        System.out.println("Car created");
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
