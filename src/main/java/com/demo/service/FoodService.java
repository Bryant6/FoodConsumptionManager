package com.demo.service;


import com.demo.domain.Food;
import com.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FoodService {
    public List<Food> selectAllFood();

    public void deleteFood(int id);

    public Food selectFoodById(int id);

    public void updateFood(String name,String type,String pay,String canteen,int id);

    public void addFood(String name,String type,String pay,String canteen);

}
