package com.yyqdemao.devment.could_payment8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CouldPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CouldPayment8001Application.class, args);
    }

}
