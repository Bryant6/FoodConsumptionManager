package com.demo.service;

import com.demo.domain.Canteen;
import com.demo.domain.Food;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CanteenService {
    public List<Canteen> selectAllCanteen();

    public List<Food> findFood(String canteen);

    public Canteen findCanteen(int id);

    public void updateCanteen( String name, String workerNumber, String info, String openTime, int id);
}
