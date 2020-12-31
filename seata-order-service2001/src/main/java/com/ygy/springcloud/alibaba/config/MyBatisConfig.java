package com.ygy.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ygy
 * @create 2020-12-28 17:40
 */
@Configuration
@MapperScan({"com.ygy.springcloud.alibaba.dao"})
public class MyBatisConfig {

}