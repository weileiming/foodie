package com.lmfirst.service;

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

}
