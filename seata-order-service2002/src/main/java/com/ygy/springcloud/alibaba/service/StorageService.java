package com.ygy.springcloud.alibaba.service;

/**
 * @author ygy
 * @create 2020-12-28 18:14
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}
