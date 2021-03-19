package com.yyqdemao.could_openfeign_order80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients//启用feign
public class CouldOpenfeignOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CouldOpenfeignOrder80Application.class, args);
    }

}
