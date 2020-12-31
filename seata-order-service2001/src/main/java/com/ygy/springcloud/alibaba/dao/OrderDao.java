package com.ygy.springcloud.alibaba.dao;

import com.ygy.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ygy
 * @create 2020-12-28 16:26
 */
@Mapper
public interface OrderDao {
    //1.新建订单
    void create(Order order);

    //2.修改订单状态，从0改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
