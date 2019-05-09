package com.shirodemo.demo.controller;

import com.shirodemo.demo.dao.User;
import com.shirodemo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Winston
 * @title: UserController
 * @projectName shiroDemo
 * @description:
 * @date 2019/5/9 9:46
 */
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/query")
    public List<User> query(){
        return userService.queryUser();
    }

}
