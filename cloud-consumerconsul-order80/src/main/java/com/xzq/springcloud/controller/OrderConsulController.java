package com.xzq.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderZKController
 * @description:
 * @author: XZQ
 * @create: 2020/3/6 22:02
 **/
@RestController
@RequestMapping("/consumer")
public class OrderConsulController {

    private static final String INVOKE_URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/payment/consul")
    public String get() {
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }


}
