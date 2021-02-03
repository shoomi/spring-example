package com.example.demo.api;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

    @Override
    public void getName() {
        System.out.println("I'm car");
    }
}
