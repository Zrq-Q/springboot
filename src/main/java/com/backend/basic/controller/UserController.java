package com.backend.basic.controller;

import com.backend.basic.entity.UserInfo;
import com.backend.basic.entity.vo.ResponseBean;
import com.backend.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description: user controller
 *
 * @author Richy
 * create: 2021-07-06 14:55
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @PostMapping(value = {"/add"})
    public ResponseBean<Boolean> addUser(@RequestBody UserInfo userInfo){
        try{
            Boolean result = userService.addUser(userInfo);
            if(!result){
                return new ResponseBean<>(412, "add failed, user info is wrong!", null);
            }
            return new ResponseBean<>(200, "add success", null);
        }catch (Exception e) {
            return new ResponseBean<>(401, "add failed :" + e.getMessage(), null);
        }
    }

    @DeleteMapping(value = {"/delete"})
    public ResponseBean deleteUser(@RequestParam("user_id") Integer userId){
        try{
            userService.deleteUser(userId);
            return new ResponseBean<>(200, "delete success", null);
        }catch (Exception e) {
            return new ResponseBean<>(401, "delete failed :" + e.getMessage(), null);
        }
    }

    @GetMapping(value = {"/all"})
    public ResponseBean<List<UserInfo>> getUser(
            @RequestParam(name = "user_id", required = false) Integer userId,
            @RequestParam(name = "user_name", required = false) String userName){
        try{
            List<UserInfo> userInfos = userService.getUser(userId, userName);
            return new ResponseBean<>(200, "get user info success", userInfos);
        }catch (Exception e) {
            return new ResponseBean<>(401, "get failed :" + e.getMessage(), null);
        }
    }


    @Autowired
    public void setUserService(UserService userService){
        this.userService =userService;
    }

}