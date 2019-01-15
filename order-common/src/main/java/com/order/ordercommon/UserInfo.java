package com.order.ordercommon;

import java.io.Serializable;

/**
 * @Auther: 吴宸煊
 * @Date: 2019/1/15
 * @Description: 公共类
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -4963266899668807475L;
    private String userName;

    private Long userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
