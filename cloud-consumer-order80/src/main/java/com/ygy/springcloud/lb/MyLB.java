package com.ygy.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ygy
 * @create 2020-12-23 14:37
 */
@Component
public class MyLB implements LoadBalance{

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current>=Integer.MAX_VALUE?0:current+1;

        }while(!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****第几次访问，次数next"+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstance) {
        int index = getAndIncrement()%serviceInstance.size();
        return serviceInstance.get(index);
    }


}
