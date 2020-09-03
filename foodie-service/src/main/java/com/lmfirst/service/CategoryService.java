package com.lmfirst.service;

import com.lmfirst.pojo.Carousel;
import com.lmfirst.pojo.Category;

import java.util.List;

/**
 * CarouselService
 *
 * @author leiming
 * @date 9/3/20
 */
public interface CategoryService {

    /**
     * 查询所有一级分类
     * @return
     */
    public List<Category> queryAllRootLevelCat();

}
