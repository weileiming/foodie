package com.lmfirst.controller;

import com.lmfirst.enums.YesOrNo;
import com.lmfirst.pojo.Carousel;
import com.lmfirst.service.CarouselService;
import com.lmfirst.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * IndexController
 *
 * @author leiming
 * @date 9/3/20
 */
@Api(value = "首页", tags = { "首页展示的相关接口" })
@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    private CarouselService carouselService;

    @ApiOperation(value = "获取首页轮播图列表", notes = "获取首页轮播图列表", httpMethod = "GET")
    @GetMapping("/carousel")
    public JSONResult carousel() {
        List<Carousel> list = carouselService.queryAll(YesOrNo.YES.type);
        return JSONResult.ok(list);
    }

}
