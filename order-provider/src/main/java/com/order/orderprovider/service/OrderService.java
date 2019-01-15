package com.order.orderprovider.service;

import com.order.ordercommon.UserInfo;

/**
 * @Auther: 吴宸煊
 * @Date: 2019/1/15
 * @Description: dubbo接口，服务提供者
 */
public interface OrderService {
    UserInfo getUserById(Long userId);
}
