package com.example.secureorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SecureOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecureOrderServiceApplication.class, args);
    }

}
