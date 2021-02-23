package com.example.demo.api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

    @Value("${car.name}")
    public String name;

    @Override
    public void getName() {
        System.out.println("I'm car " + name);
    }
}
