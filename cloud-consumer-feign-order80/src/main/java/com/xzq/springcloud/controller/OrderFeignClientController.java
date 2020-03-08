package com.xzq.springcloud.controller;

import com.xzq.springcloud.entities.CommonResult;
import com.xzq.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: OrderFeignClientController
 * @description:
 * @author: XZQ
 * @create: 2020/3/8 15:28
 **/
@RestController
@RequestMapping("/consumer")
public class OrderFeignClientController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    /**
     * 模拟feign超时
     *
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // openfeign-ribbon, 客户端一般默认等待1秒钟
        return paymentFeignService.paymentFeignTimeout();
    }


}
