package com.lmfirst.mapper;

import com.lmfirst.pojo.vo.ItemCommentVO;
import com.lmfirst.pojo.vo.SearchItemsVO;
import com.lmfirst.pojo.vo.ShopcartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ItemsMapperCustom {

    public List<ItemCommentVO> queryItemComments(@Param("paramsMap") Map<String, Object> map);

    public List<SearchItemsVO> searchItems(@Param("paramsMap") Map<String, Object> map);

    public List<SearchItemsVO> searchItemsByThirdCat(@Param("paramsMap") Map<String, Object> map);

    public List<ShopcartVO> queryItemsBySpecIds(@Param("paramsList") List<String> specIdsList);

    public int decreaseItemSpecStock(@Param("spedId") String specId, @Param("pendingCounts") int pendingCounts);

}