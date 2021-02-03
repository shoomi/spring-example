package com.example.demo.api;

import org.springframework.stereotype.Component;

@Component("bus")
public class Bus implements Vehicle {
    @Override
    public void getName() {
        System.out.println("I'm bus");
    }
}
