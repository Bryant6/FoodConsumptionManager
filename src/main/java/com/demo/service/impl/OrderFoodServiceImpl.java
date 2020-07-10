package com.demo.service.impl;

import com.demo.domain.Food;
import com.demo.mapper.OrderFoodMapper;
import com.demo.service.OrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderFoodServiceImpl implements OrderFoodService {

    @Autowired
    private OrderFoodMapper orderFoodMapper;

    @Override
    public List<Food> selectFoodByName(String name) {
        return orderFoodMapper.selectFoodByName(name);
    }

    @Override
    public List<Food> selectFoodByCanteen(String canteen) {
        return orderFoodMapper.selectFoodByCanteen(canteen);
    }
}
