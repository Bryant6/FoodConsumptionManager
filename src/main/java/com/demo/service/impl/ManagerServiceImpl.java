package com.demo.service.impl;

import com.demo.domain.User;
import com.demo.mapper.ManagerMapper;
import com.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private  ManagerMapper managerMapper;
    @Override
    public List<User> selectAllUser() {
        return managerMapper.selectAllUser();
    }

    @Override
    public void DeleteUser(int id) {
        managerMapper.DeleteUser(id);
    }

    @Override
    public User selectUserById(int id) {
        return managerMapper.selectUserById(id);
    }
}
