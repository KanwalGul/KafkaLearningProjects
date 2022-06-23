package com.example.demokafkatemplaterecive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
@SpringBootApplication
public class HelloApplication extends Application {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}