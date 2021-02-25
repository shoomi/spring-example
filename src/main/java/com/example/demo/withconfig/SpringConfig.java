package com.example.demo.withconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    Car car() {
        return new Car();
    }

    @Bean
    Bus bus() {
        return new Bus();
    }

    @Bean
    Controller controller() {
        return new Controller(car());
    }
}
