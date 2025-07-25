package com.suraj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "model")  // or better: "com.suraj.demo.model"
@EnableJpaRepositories(basePackages = "com.suraj.demo.repo")
public class ExmpleOfJpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExmpleOfJpaApplication.class, args);
    }
}

