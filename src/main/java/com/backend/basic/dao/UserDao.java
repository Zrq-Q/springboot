package com.backend.basic.dao;

import com.backend.basic.entity.UserInfo;
import com.backend.basic.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * description: user data operation
 *
 * @author Richy
 * create: 2021-07-06 15:54
 **/

@Repository
public class UserDao {
    private UserMapper userMapper;

    public void addUser(UserInfo userInfo){
        userMapper.insertUser(userInfo);
    }

    public void deleteUser(Integer userId){ userMapper.deleteUser(userId); }

    public List<UserInfo> getAllUser(Integer userId, String userName){ return userMapper.getAllUser(userId, userName); }

    @Autowired
    public void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }
}