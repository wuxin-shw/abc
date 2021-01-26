package com.wuxin.service.impl;

import com.wuxin.mapper.UserMapper;
import com.wuxin.pojo.Users;
import com.wuxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 孙豪文
 * 2020/12/10
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int addUsers(Users u) {
        return userMapper.addUsers(u);
    }
}
