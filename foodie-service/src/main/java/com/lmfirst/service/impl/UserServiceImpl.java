package com.lmfirst.service.impl;

import com.lmfirst.mapper.UsersMapper;
import com.lmfirst.pojo.Users;
import com.lmfirst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

/**
 * UserServiceImpl
 *
 * @author leiming
 * @date 2019/12/17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UsersMapper usersMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {
        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andEqualTo("username", username);
        Users result = usersMapper.selectOneByExample(userExample);

        return result == null ? false : true;
    }

}
