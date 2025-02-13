package com.river.model;

import org.springframework.stereotype.Component;

@Component
public class Pen {
    public Pen() {
        System.out.println("Pen created");
    }

    public void write() {
        System.out.println("Writing");
    }
}
