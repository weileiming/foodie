package com.lmfirst.service;

import com.lmfirst.pojo.Items;
import com.lmfirst.pojo.ItemsImg;
import com.lmfirst.pojo.ItemsParam;
import com.lmfirst.pojo.ItemsSpec;
import com.lmfirst.pojo.vo.CommentLevelCountsVO;
import com.lmfirst.pojo.vo.ShopcartVO;
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

    /**
     * 根据分类id搜索商品列表
     * @param catId
     * @param sort
     * @param page
     * @param pageSize
     * @return
     */
    public PagedGridResult searchItems(Integer catId, String sort, Integer page, Integer pageSize);

    /**
     * 根据规格ids查询最新的购物车中商品数据（用于刷新渲染购物车中的商品数据）
     * @param specIds
     * @return
     */
    public List<ShopcartVO> queryItemsBySpecIds(String specIds);

    /**
     * 根据商品规格id获取规格对象的具体信息
     * @param specId
     * @return
     */
    public ItemsSpec queryItemSpecById(String specId);

    /**
     * 根据商品id获得商品图片主图url
     * @param itemId
     * @return
     */
    public String queryItemMainImgById(String itemId);

    /**
     * 减少库存
     * @param specId
     * @param buyCounts
     */
    public void decreaseItemSpecStock(String specId, int buyCounts);

}
