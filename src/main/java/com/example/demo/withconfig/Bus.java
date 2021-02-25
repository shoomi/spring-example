package com.example.demo.withconfig;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bus implements Vehicle {

    @PostConstruct
    private void doInit() {
        System.out.println("Init bus");
    }

    @PreDestroy
    protected void doDestroy() {
        System.out.println("Destroy bean");
    }

    @Value("VAZ")
    private String name;

    @Override
    public void getName() {
        System.out.println("I'm bus " + name);
    }
}
