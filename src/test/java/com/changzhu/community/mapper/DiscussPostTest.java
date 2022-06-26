package com.changzhu.community.mapper;

import com.changzhu.community.CommunityApplication;
import com.changzhu.community.dao.DiscussPostMapper;
import com.changzhu.community.entity.DiscussPost;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author leiliu
 * @date 22-6-24 上午8:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class DiscussPostTest {
    @Autowired
    DiscussPostMapper discussPostMapper;

    @Test
    public void test(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0,0,10);

    }
}
