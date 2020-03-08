package com.xzq.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: MyLB
 * @description:
 * @author: XZQ
 * @create: 2020/3/7 15:55
 **/
@Component
public class MyLB implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement() {
        int current;
        int next;

        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!atomicInteger.compareAndSet(current, next));
        System.out.println("第几次访问,次数next:" + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
