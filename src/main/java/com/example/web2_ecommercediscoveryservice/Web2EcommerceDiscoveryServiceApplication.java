package com.example.web2_ecommercediscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Web2EcommerceDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Web2EcommerceDiscoveryServiceApplication.class, args);
    }

}
