package com.xzq.springcloud.service.impl;

import com.xzq.springcloud.dao.PaymentDao;
import com.xzq.springcloud.entities.Payment;
import com.xzq.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentServiceImpl
 * @description:
 * @author: XZQ
 * @create: 2020/3/5 18:19
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
