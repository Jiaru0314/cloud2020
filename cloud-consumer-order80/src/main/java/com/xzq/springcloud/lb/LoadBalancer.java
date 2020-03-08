package com.xzq.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @InterfaceName: LoadBalancer
 * @description:
 * @author: XZQ
 * @create: 2020/3/7 15:55
 **/
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
