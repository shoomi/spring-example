package com.example.demo;

import com.example.demo.api.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Controller controller = context.getBean(Controller.class);
        controller.doIt();
    }

}
