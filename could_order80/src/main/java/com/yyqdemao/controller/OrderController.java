package com.yyqdemao.controller;

import com.yyqdemao.comment.entities.CommonResult;
import com.yyqdemao.comment.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://COULDPAYMENT/payment";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public CommonResult<Payment> getInfo(Payment payment) {

        return restTemplate.postForObject(PAYMENT_URL, payment, CommonResult.class);
    }

    @GetMapping("id")
    public CommonResult<Payment> getById(long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/?id=" + id, CommonResult.class);
    }
}
