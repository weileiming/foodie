package com.lmfirst.mapper;

import com.lmfirst.pojo.vo.CategoryVO;
import com.lmfirst.pojo.vo.NewItemsVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CategoryMapperCustom {

    public List<CategoryVO> getSubCatList(Integer rootCatId);

    public List<NewItemsVo> getSixNewItemsLazy(@Param("paramsMap") Map<String, Object> map);

}