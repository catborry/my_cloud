package com.yyqdemao.controller;

import com.yyqdemao.comment.entities.CommonResult;
import com.yyqdemao.comment.entities.Payment;
import com.yyqdemao.ib.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("order")
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://COULDPAYMENT/payment";
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancer loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping
    public CommonResult<Payment> getInfo(Payment payment) {

        return restTemplate.postForObject(PAYMENT_URL, payment, CommonResult.class);
    }

    @GetMapping("id")
    public CommonResult<Payment> getById(long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/?id=" + id, CommonResult.class);
    }

    /**
     * 自实现轮询
     *
     * @param id
     * @return
     */
    @GetMapping("lb")
    public String getPaymentLb(long id) {
        List<ServiceInstance> couldpayment = discoveryClient.getInstances("COULDPAYMENT");
        if (couldpayment == null || couldpayment.size() <= 0) {
            return null;
        }
        ServiceInstance instance = loadBalancer.instance(couldpayment);
        URI uri = instance.getUri();
        return restTemplate.getForObject(uri + "/payment/?id=" + id, String.class);
    }
}
