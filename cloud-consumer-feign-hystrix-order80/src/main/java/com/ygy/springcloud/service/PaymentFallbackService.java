package com.ygy.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author ygy
 * @create 2020-12-24 1:25
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK,呜呜";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_TimeOut,呜呜";
    }
}
