package com.ygy.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ygy.springcloud.entities.CommonResult;
import com.ygy.springcloud.entities.Payment;

/**
 * @author ygy
 * @create 2020-12-27 23:27
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException------1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义,global handlerException------2");
    }
}
