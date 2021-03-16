package com.yyqdemao.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {


    @Bean
    @LoadBalanced
    //启用默认负载均衡,可以使用服务名调用其他服务
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
