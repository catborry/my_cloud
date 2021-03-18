package com.yyqdemao;

import com.config.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "COULDPAYMENT",configuration = MySelfRule.class)
public class CouldOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CouldOrder80Application.class, args);
    }

}
