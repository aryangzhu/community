package com.changzhu.community.dao;

import com.changzhu.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author leiliu
 * @date 22-6-20 下午4:34
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(@Param("id")int id,@Param("status")int status);

    int updateHeader(@Param("id")int id,@Param("headerUrl")String headerUrl);

    int updatePassword(int id,String password);
}
