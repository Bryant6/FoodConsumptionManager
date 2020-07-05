package com.demo.service;

import com.demo.domain.User;

import java.util.List;

public interface ManagerService {

    public List<User> selectAllUser();

    public void DeleteUser(int id);

    User selectUserById(int id);

    public void updateUser(String username,String password,int id);
}
