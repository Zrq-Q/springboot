package com.backend.basic.mapper;

import com.backend.basic.entity.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Richy
 */

@Repository
public interface UserMapper {

    /**
     * 添加新用户
     *
     * @param userInfo 用户信息
     */
    void insertUser(UserInfo userInfo);

    /**
     * 根据用户id删除用户
     *
     * @param userId 用户id
     */
    void deleteUser(Integer userId);

    /**
     * 获取所有的用户信息
     *
     * @param userId   用户id
     * @param userName  用户姓名
     * @return List<UserInfo> 用户信息
     */
    List<UserInfo> getAllUser(Integer userId, String userName);
}
