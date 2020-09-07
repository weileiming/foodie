package com.lmfirst.service.impl;

import com.lmfirst.mapper.CarouselMapper;
import com.lmfirst.mapper.CategoryMapper;
import com.lmfirst.mapper.CategoryMapperCustom;
import com.lmfirst.pojo.Carousel;
import com.lmfirst.pojo.Category;
import com.lmfirst.pojo.vo.CategoryVO;
import com.lmfirst.service.CarouselService;
import com.lmfirst.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * CategoryServiceImpl
 *
 * @author leiming
 * @date 9/3/20
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CategoryMapperCustom categoryMapperCustom;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<Category> queryAllRootLevelCat() {
        Example example = new Example(Category.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("type", 1);
        List<Category> result = categoryMapper.selectByExample(example);
        return result;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public List<CategoryVO> getSubCatList(Integer rootCatId) {
        return categoryMapperCustom.getSubCatList(rootCatId);
    }

}
