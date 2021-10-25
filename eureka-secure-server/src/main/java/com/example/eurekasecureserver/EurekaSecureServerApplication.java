package com.example.eurekasecureserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSecureServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSecureServerApplication.class, args);
    }

}
