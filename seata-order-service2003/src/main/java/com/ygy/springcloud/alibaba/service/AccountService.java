package com.ygy.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author ygy
 * @create 2020-12-28 19:45
 */
public interface AccountService {
    /**
     * 扣减账户余额
     */
    void decrease(Long userId,BigDecimal money);
}
