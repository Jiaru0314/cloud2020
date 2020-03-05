package com.xzq.springcloud.service;

import com.xzq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName: PaymentService
 * @description:
 * @author: XZQ
 * @create: 2020/3/5 18:18
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
