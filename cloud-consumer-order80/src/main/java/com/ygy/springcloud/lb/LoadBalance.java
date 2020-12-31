package com.ygy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author ygy
 * @create 2020-12-23 14:34
 */
public interface LoadBalance {
    ServiceInstance instances(List<ServiceInstance> serviceInstance);
}
