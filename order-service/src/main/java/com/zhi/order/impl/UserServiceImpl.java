package com.zhi.order.impl;

import com.zhi.order.UserService;
import com.zhi.order.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        String name = this.userMapper.getName();
        System.out.println(name);
        return "Hello, World";
    }
}
