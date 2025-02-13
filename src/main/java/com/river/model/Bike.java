package com.river.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bike implements Transport {

    public Bike() {
        System.out.println("Bike created");
    }

    @Override
    public void drive() {
        System.out.println("Driving a bike");
    }
}
