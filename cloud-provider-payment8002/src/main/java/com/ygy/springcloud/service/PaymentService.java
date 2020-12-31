package com.ygy.springcloud.service;

import com.ygy.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ygy
 * @create 2020-12-21 17:14
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
