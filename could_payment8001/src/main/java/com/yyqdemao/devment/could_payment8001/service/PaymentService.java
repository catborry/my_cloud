package com.yyqdemao.devment.could_payment8001.service;

import com.yyqdemao.comment.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
