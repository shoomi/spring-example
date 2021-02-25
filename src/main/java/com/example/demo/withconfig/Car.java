package com.example.demo.withconfig;
import org.springframework.beans.factory.annotation.Value;

public class Car implements Vehicle {

    @Value("${car.name}")
    public String name;

    @Override
    public void getName() {
        System.out.println("I'm car " + name);
    }
}
