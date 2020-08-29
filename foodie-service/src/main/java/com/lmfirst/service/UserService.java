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

    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    public Users queryUserForLogin(String username, String password);

}
