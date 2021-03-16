package com.yyqdemao.devment.could_payment8002.controller;

import com.yyqdemao.comment.entities.CommonResult;
import com.yyqdemao.comment.entities.Payment;
import com.yyqdemao.devment.could_payment8002.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int i = paymentService.create(payment);
        if (i > 0)
            return CommonResult.success();
        return CommonResult.error();
    }

    @GetMapping
    public CommonResult<Payment> getPayment(long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        return new CommonResult<Payment>(200, "操作成功8002", paymentById);
    }
    @GetMapping("discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                String serviceId = instance.getServiceId();
                String host = instance.getHost();
                URI uri = instance.getUri();
            }
        }
        return discoveryClient;
    }

}
