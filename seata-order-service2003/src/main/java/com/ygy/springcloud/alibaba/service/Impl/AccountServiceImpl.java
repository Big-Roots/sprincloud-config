package com.ygy.springcloud.alibaba.service.Impl;

import com.ygy.springcloud.alibaba.dao.AccountDao;
import com.ygy.springcloud.alibaba.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author ygy
 * @create 2020-12-28 19:46
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        System.out.println("----->account-service中扣减账户余额开始");
        try {
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.decrease(userId, money);
        System.out.println("----->account-service中扣减账户余额结束");
    }
}
