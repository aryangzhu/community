package com.changzhu.community.dao;

import com.changzhu.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author leiliu
 * @date 22-6-24 上午8:33
 */
@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(@Param("userId")int userId, @Param("offset") int offset, @Param("limit") int limit);

    int selectDiscussPostRows(@Param("userId") int userId);


}
