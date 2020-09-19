package com.lmfirst.service;

import com.lmfirst.pojo.bo.SubmitOrderBO;

/**
 * OrderService
 *
 * @author leiming
 * @date 9/17/20
 */
public interface OrderService {

    /**
     * 用于创建订单相关信息
     * @param submitOrderBO
     */
    public String createOrder(SubmitOrderBO submitOrderBO);

}
