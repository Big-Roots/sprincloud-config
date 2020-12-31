package com.ygy.springcloud.alibaba.controller;

import com.ygy.springcloud.alibaba.domain.CommonResult;
import com.ygy.springcloud.alibaba.domain.Order;
import com.ygy.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ygy
 * @create 2020-12-28 17:38
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
