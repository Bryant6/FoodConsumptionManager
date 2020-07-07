package com.demo.service.impl;

import com.demo.domain.Food;
import com.demo.domain.User;
import com.demo.mapper.FoodMapper;
import com.demo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;


    @Override
    public List<Food> selectAllFood() {
        return foodMapper.selectAllFood();
    }

    @Override
    public void deleteFood(int id) {
        foodMapper.deleteFood(id);
    }

    @Override
    public Food selectFoodById(int id) {
        return foodMapper.selectFoodById(id);
    }

    @Override
    public void updateFood(String name, String type, String pay, String canteen, int id) {
        foodMapper.updateFood(name,type,pay,canteen,id);
    }

    @Override
    public void addFood(String name, String type, String pay, String canteen) {
        foodMapper.addFood(name,type,pay,canteen);
    }
}
