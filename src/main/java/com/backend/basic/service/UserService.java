package com.backend.basic.service;

import com.backend.basic.entity.UserInfo;

import java.util.List;

/**
 *
 */
public interface UserService {

    /**
     * @param userInfo 用户信息
     *
     * @return Boolean
     */
    Boolean addUser(UserInfo userInfo);

    /**
     * @param userId 用户id
     */
    void deleteUser(Integer userId);

    /**
     * @param userId  用户id
     * @param userName  用户姓名
     *
     * @return List<UserInfo> 全部用户信息
     */
    List<UserInfo> getUser(Integer userId, String userName);
}
