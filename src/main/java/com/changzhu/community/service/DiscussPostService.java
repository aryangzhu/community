package com.changzhu.community.service;

import com.changzhu.community.dao.DiscussPostMapper;
import com.changzhu.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author leiliu
 * @date 22-6-24 上午11:42
 */
@Service
public class DiscussPostService {

    @Autowired
    DiscussPostMapper discussPostMapper;

    //分页查询
    public List<DiscussPost> findDiscussPosts(int userId,int offset,int limit){
        return discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }


    //查询帖子数量
    public int findDiscussPostRows(int id ){
        return discussPostMapper.selectDiscussPostRows(id);
    }
}
