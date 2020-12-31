package com.ygy.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ygy
 * @create 2020-12-28 19:31
 */
@Configuration
@MapperScan({"com.ygy.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
