package com.yyqdemao.could_openfeign_order80.service;

import com.yyqdemao.comment.entities.CommonResult;
import com.yyqdemao.comment.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "COULDPAYMENT")
public interface PaymentFeignService {

    @GetMapping("/payment")
    CommonResult<Payment> getPayment(@RequestParam(value = "id") int id);
}
