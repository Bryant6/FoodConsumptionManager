package com.demo.service.impl;

import com.demo.domain.Canteen;
import com.demo.domain.Food;
import com.demo.mapper.CanteenMapper;
import com.demo.service.CanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanteenServiceImpl implements CanteenService {

    @Autowired
    private CanteenMapper canteenMapper;

    @Override
    public List<Canteen> selectAllCanteen() {
        return canteenMapper.selectAllCanteen();
    }

    @Override
    public List<Food> findFood(String canteen) {
        return canteenMapper.findFood(canteen);
    }

    @Override
    public Canteen findCanteen(int id) {
        return canteenMapper.findCanteen(id);
    }

    @Override
    public void updateCanteen(String name, String workerNumber, String info, String openTime, int id) {
        canteenMapper.updateCanteen(name,workerNumber,info,openTime,id);
    }
}
