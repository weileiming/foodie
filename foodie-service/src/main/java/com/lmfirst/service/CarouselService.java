package com.lmfirst.service;

import com.lmfirst.pojo.Carousel;

import java.util.List;

/**
 * CarouselService
 *
 * @author leiming
 * @date 9/3/20
 */
public interface CarouselService {

    /**
     * 查询所有轮播图列表
     * @param isShow
     * @return
     */
    public List<Carousel> queryAll(Integer isShow);

}
