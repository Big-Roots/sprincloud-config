package com.ygy.springcloud.alibaba.service.impl;

import com.ygy.springcloud.alibaba.dao.StorageDao;
import com.ygy.springcloud.alibaba.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ygy
 * @create 2020-12-28 18:15
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;
    @Override
    public void decrease(Long productId, Integer count) {
        System.out.println("---->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        System.out.println("---->storage-service中扣减库存结束");
    }
}
