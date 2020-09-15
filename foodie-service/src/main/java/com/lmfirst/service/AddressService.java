package com.lmfirst.service;

import com.lmfirst.pojo.UserAddress;
import com.lmfirst.pojo.bo.AddressBO;

import java.util.List;

/**
 * AddressService
 *
 * @author leiming
 * @date 9/11/20
 */
public interface AddressService {

    /**
     * 根据用户id查询用户的收货地址列表
     * @param userId
     * @return
     */
    public List<UserAddress> queryAll(String userId);

    /**
     * 用户新增地址
     * @param addressBO
     */
    public void addNewUserAddress(AddressBO addressBO);

    /**
     * 用户修改地址
     * @param addressBO
     */
    public void updateUserAddress(AddressBO addressBO);

}
