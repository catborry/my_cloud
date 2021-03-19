package com.yyqdemao.could_openfeign_order80.controller;

import com.yyqdemao.comment.entities.CommonResult;
import com.yyqdemao.comment.entities.Payment;
import com.yyqdemao.could_openfeign_order80.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("feign")
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping
    public String order(int id) {
        System.out.println(id);
        CommonResult<Payment> payment = paymentFeignService.getPayment(id);
        return payment.toString();
    }


}
