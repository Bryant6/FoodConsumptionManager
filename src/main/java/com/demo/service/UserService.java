package com.demo.service;

import com.demo.domain.User;

import java.util.List;

public interface UserService {

    //查询所有
    public List<User> findAll();

    //保存用户
    public void save(User user);

    //注册用户
    public void insertUsernameAndPassword(User user);

    public User selectUsernameAndPassword(String username, String password);
}
