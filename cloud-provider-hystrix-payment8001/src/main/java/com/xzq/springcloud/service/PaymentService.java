package com.xzq.springcloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: PaymentService
 * @description:
 * @author: XZQ
 * @create: 2020/3/8 15:00
 **/
@Service
public class PaymentService {

    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentinfo_ok,id:" + id + "\t";
    }

    /**
     * 访问超时
     *
     * @param id
     * @return
     */
    public String paymentInfo_TimeOut(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentinfo_Timeout,id:" + id + "\t" + "耗时3秒";
    }
}
