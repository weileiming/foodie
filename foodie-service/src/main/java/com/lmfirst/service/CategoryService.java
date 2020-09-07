package com.lmfirst.service;

import com.lmfirst.pojo.Carousel;
import com.lmfirst.pojo.Category;
import com.lmfirst.pojo.vo.CategoryVO;

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

    /**
     * 根据一级分类id查询子分类信息
     * @param rootCatId
     * @return
     */
    public List<CategoryVO> getSubCatList(Integer rootCatId);

}
