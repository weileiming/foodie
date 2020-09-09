package com.lmfirst.service;

import com.lmfirst.pojo.Items;
import com.lmfirst.pojo.ItemsImg;
import com.lmfirst.pojo.ItemsParam;
import com.lmfirst.pojo.ItemsSpec;
import com.lmfirst.pojo.vo.CommentLevelCountsVO;
import com.lmfirst.pojo.vo.ItemCommentVO;
import com.lmfirst.utils.PagedGridResult;

import java.util.List;

/**
 * ItemService
 *
 * @author leiming
 * @date 9/8/20
 */
public interface ItemService {

    /**
     * 根据商品id查询详情
     * @param itemId
     * @return
     */
    public Items queryItemById(String itemId);

    /**
     * 根据商品id查询商品图片列表
     * @param itemId
     * @return
     */
    public List<ItemsImg> queryItemImgList(String itemId);

    /**
     * 根据商品id查询商品规格列表
     * @param itemId
     * @return
     */
    public List<ItemsSpec> queryItemSpecList(String itemId);

    /**
     * 根据商品id查询商品参数
     * @param itemId
     * @return
     */
    public ItemsParam queryItemParams(String itemId);

    /**
     * 根据商品id查询商品的评价等级数量
     * @param itemId
     */
    public CommentLevelCountsVO queryCommentCounts(String itemId);

    /**
     * 这是根据商品id查询商品评价（分页）
     * @param itemId
     * @param level
     * @param page
     * @param pageSize
     * @return
     */
    public PagedGridResult queryPagedComments(String itemId, Integer level, Integer page, Integer pageSize);

    /**
     * 搜索商品列表
     * @param keywords
     * @param sort
     * @param page
     * @param pageSize
     * @return
     */
    public PagedGridResult searchItems(String keywords, String sort, Integer page, Integer pageSize);

}
