package com.order.orderconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.order.ordercommon.UserInfo;
import com.order.orderprovider.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 吴宸煊
 * @Date: 2019/1/15
 * @Description: dubbo的controller层，服务消费者
 */
@RestController
public class DubboConsumerController {

    @Reference(version = "1.0.0")
    private OrderService orderService;

    @RequestMapping("/")
    public UserInfo index() {
        return orderService.getUserById(Long.valueOf(1));
    }
}
