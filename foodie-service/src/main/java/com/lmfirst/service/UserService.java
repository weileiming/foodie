package com.lmfirst.service;

import com.lmfirst.pojo.Users;
import com.lmfirst.pojo.bo.UserBO;

/**
 * UserService
 *
 * @author leiming
 * @date 2019/12/17
 */
public interface UserService {

    /**
     * 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);

    /**
     * 创建用户
     */
    public Users createUser(UserBO userBO);

}
