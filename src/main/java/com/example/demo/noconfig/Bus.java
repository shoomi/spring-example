package com.example.demo.noconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bus")
public class Bus implements Vehicle {

    @PostConstruct
    // перезапище @value("...")
    private void doInit() {
        name = "VAZ-init";
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

    @Override
    public String getType() {
        return "bus";
    }
}
