package com.lmfirst.service;

import com.lmfirst.pojo.bo.SubmitOrderBO;
import com.lmfirst.pojo.vo.OrderVO;

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
    public OrderVO createOrder(SubmitOrderBO submitOrderBO);

    /**
     * 修改订单状态
     * @param orderId
     * @param orderStatus
     */
    public void updateOrderStatus(String orderId, Integer orderStatus);

}
