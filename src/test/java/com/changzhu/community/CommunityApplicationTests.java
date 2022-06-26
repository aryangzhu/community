package com.changzhu.community;

import com.changzhu.community.dao.UserMapper;
import com.changzhu.community.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void insertUser(){
        User user=new User();
        user.setUsername("张三");
        user.setCreateTime(new Date());
        user.setType(1);
        user.setStatus(0);

        int result=userMapper.insertUser(user);
    }

    @Test
    void selectUserById(){
        User user=userMapper.selectById(101);
        System.out.println(user);
    }
}
