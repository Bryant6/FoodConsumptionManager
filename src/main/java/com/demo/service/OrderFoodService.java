package com.demo.service;

import com.demo.domain.Food;

import java.util.List;

public interface OrderFoodService {
    public List<Food> selectFoodByName(String name);

    public List<Food> selectFoodByCanteen(String canteen);
}
