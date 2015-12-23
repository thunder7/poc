package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {
    private final String name;
    
    public static void main(String[] args) {
       SpringApplication.run(HelloApplication.class, args);
    }

    public HelloApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name + "aa";
    }
}