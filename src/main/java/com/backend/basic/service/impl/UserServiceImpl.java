package com.backend.basic.service.impl;

import com.backend.basic.dao.UserDao;
import com.backend.basic.entity.UserInfo;
import com.backend.basic.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * description: impl
 *
 * @author Richy
 * create: 2021-07-06 15:26
 **/

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public Boolean addUser(UserInfo userInfo) {
        if(userInfo.getUserId() == null || userInfo.getUserName() == null){
            return false;
        }else {
            userDao.addUser(userInfo);
            return true;
        }
    }

    @Override
    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }

    @Override
    public List<UserInfo> getUser(Integer userId, String userName) {
        return userDao.getAllUser(userId, userName);
    }

    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
}