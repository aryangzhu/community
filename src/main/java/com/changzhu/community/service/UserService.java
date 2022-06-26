package com.changzhu.community.service;

import com.changzhu.community.dao.UserMapper;
import com.changzhu.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author leiliu
 * @date 22-6-24 上午11:56
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    //根据id查询
    public User findUserById(int userId){
        return userMapper.selectById(userId);
    }
}
