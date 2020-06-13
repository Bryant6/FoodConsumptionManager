package com.demo.service.impl;

import com.demo.domain.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        System.out.println("service层：查询所有账户。");
        return userMapper.findAll();
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void insertUsernameAndPassword(User user) {
        userMapper.insertUsernameAndPassword(user);
    }

    @Override
    public User selectUsernameAndPassword(String username, String password) {
        return userMapper.selectUsernameAndPassword(username,password);
    }
}
