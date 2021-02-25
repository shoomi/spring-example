package com.example.demo.withconfig;

public class Controller {

    Vehicle vehicle;

    public Controller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void doIt() {
        vehicle.getName();
    }
}
