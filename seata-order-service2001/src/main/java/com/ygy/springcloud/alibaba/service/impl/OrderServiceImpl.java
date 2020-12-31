package com.ygy.springcloud.alibaba.service.impl;

import com.ygy.springcloud.alibaba.dao.OrderDao;
import com.ygy.springcloud.alibaba.domain.Order;
import com.ygy.springcloud.alibaba.service.AccountService;
import com.ygy.springcloud.alibaba.service.OrderService;
import com.ygy.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ygy
 * @create 2020-12-28 17:24
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "ygy-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        System.out.println("---->开始新建订单");
        orderDao.create(order);

        System.out.println("---->订单微服务开始调用库存，做扣减Count");
        storageService.decrease(order.getProductId(),order.getCount());
        System.out.println("---->订单微服务开始调用库存，做扣减end");

        System.out.println("---->订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(),order.getMoney());
        System.out.println("---->订单微服务开始调用库存，做扣减end");

        System.out.println("---->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        System.out.println("---->修改订单状态结束");

        System.out.println("---->下订单结束了，哈哈");
    }
}
