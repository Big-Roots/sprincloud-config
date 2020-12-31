package com.ygy.springcloud.service.impl;

import com.ygy.springcloud.dao.PaymentDao;
import com.ygy.springcloud.entities.Payment;
import com.ygy.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ygy
 * @create 2020-12-21 17:15
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
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
