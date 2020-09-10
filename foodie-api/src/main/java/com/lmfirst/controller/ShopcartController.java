package com.lmfirst.controller;

import com.lmfirst.pojo.bo.ShopcartBO;
import com.lmfirst.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ShopcartController
 *
 * @author leiming
 * @date 9/9/20
 */
@Api(value = "购物车", tags = {"购物车相关接口"})
@RestController
@RequestMapping("shopcart")
public class ShopcartController {

    @ApiOperation(value = "添加商品到购物车", notes = "添加商品到购物车", httpMethod = "POST")
    @PostMapping("/add")
    public JSONResult add(@RequestParam String userId, @RequestBody ShopcartBO shopcartBO, HttpServletRequest request, HttpServletResponse response) {
        if (StringUtils.isBlank(userId)) {
            JSONResult.errorMsg(null);
        }
        // TODO: 前端用户在登录的情况下，添加商品到购物车，会同时在后端同步购物车到redis缓存
        return JSONResult.ok();
    }

}
