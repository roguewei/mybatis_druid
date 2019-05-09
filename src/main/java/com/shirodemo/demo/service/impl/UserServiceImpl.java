package com.shirodemo.demo.service.impl;

import com.shirodemo.demo.dao.User;
import com.shirodemo.demo.dao.UserExample;
import com.shirodemo.demo.mapper.UserMapper;
import com.shirodemo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Winston
 * @title: UserServiceImpl
 * @projectName shiroDemo
 * @description:
 * @date 2019/5/9 9:45
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUser() {
        return userMapper.selectByExample(new UserExample());
    }
}
