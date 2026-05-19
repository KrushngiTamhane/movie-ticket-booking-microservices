package com.movieticket.movieservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

@ComponentScan(basePackages = "com.movieticket")

@EnableJpaRepositories(basePackages = "com.movieticket.repository")

@EntityScan(basePackages = "com.movieticket.entity")

public class MovieServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieServiceApplication.class, args);
    }
}