package com.yyqdemao.devment.could_payment8002.service.impl;

import com.yyqdemao.comment.entities.Payment;
import com.yyqdemao.devment.could_payment8002.dao.PaymentDao;
import com.yyqdemao.devment.could_payment8002.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
