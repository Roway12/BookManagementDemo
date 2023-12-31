package com.test.controller;

import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Resource
    UserService service;

    @Resource
    UserMapper mapper;

    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid){
//        return service.getUserById(uid);
        return mapper.getUserById(uid);
    }
}
