package com.example.demo.noconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class Controller {

    @Autowired
    @Qualifier("bus")
    Vehicle vehicle;

    public void doIt() {
        vehicle.getName();
    }

    private final Map<String, Vehicle> stringVehicleMap;

    public Controller(List<Vehicle> vehicleList) {
        stringVehicleMap = vehicleList.stream()
            .collect(
                Collectors.toMap(Vehicle::getType, Function.identity()));
    }
}
