package com.yyqdemao.devment.could_payment8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CouldPayment8002Application {

    public static void main(String[] args) {
        SpringApplication.run(CouldPayment8002Application.class, args);
    }

}
