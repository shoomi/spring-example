package com.example.demo.noconfig;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class VehicleFactory {
    private final Map<String, Vehicle> stringVehicleMap;

    public VehicleFactory(List<Vehicle> vehicleList) {
        stringVehicleMap = vehicleList.stream()
            .collect(
                Collectors.toMap(Vehicle::getType, Function.identity()));
    }

    public Map<String, Vehicle> getStringVehicleMap() {
        return stringVehicleMap;
    }
}
