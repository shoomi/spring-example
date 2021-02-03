package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    @Autowired
    @Qualifier("car")
    Vehicle vehicle;

    public void doIt() {
        vehicle.getName();
    }
}
