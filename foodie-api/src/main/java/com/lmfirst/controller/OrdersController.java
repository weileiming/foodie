package com.lmfirst.controller;

import com.lmfirst.enums.PayMethod;
import com.lmfirst.pojo.bo.SubmitOrderBO;
import com.lmfirst.service.OrderService;
import com.lmfirst.utils.CookieUtils;
import com.lmfirst.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * OrdersController
 *
 * @author leiming
 * @date 9/17/20
 */
@Api(value = "订单相关", tags = "订单相关的api接口")
@RequestMapping("orders")
@RestController
public class OrdersController extends BaseController {

    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "用户下单", notes = "用户下单", httpMethod = "POST")
    @PostMapping("/create")
    public JSONResult create(@RequestBody SubmitOrderBO submitOrderBO, HttpServletRequest request, HttpServletResponse response) {
        if (submitOrderBO.getPayMethod() != PayMethod.WEXIN.type && submitOrderBO.getPayMethod() != PayMethod.ALIPAY.type) {
            return JSONResult.errorMsg("支付方式不支持");
        }
        System.out.println(submitOrderBO.toString());
        // 1. 创建订单
        String orderId = orderService.createOrder(submitOrderBO);
        // 2. 创建订单后，移除购物车中已结算（已提交）的商品
        // TODO: 整合redis之后，完善购物车中的已结算商品清除，并且同步到前端的cookie
        CookieUtils.setCookie(request, response, FOODIE_SHOPCART, "", true);
        // 3. 向支付中心发送当前订单，用于保存支付中心的订单数据

        return JSONResult.ok(orderId);
    }

}
