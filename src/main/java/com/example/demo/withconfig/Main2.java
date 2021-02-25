package com.example.demo.withconfig;

import com.example.demo.withconfig.Controller;
import com.example.demo.withconfig.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
public class Main2 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main2.class, args);
        Controller controller = context.getBean(Controller.class);
        controller.doIt();
        Vehicle vehicle = context.getBean("car", Vehicle.class);
        vehicle.getName();
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        propertySourcesPlaceholderConfigurer.setLocations(new FileSystemResource("car.properties"));
        return propertySourcesPlaceholderConfigurer;
    }

}
