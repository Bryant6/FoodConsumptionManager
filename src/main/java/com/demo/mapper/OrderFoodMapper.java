package com.demo.mapper;

import com.demo.domain.Food;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderFoodMapper {

    @Select("select * from food where name like '%${name}%'")
    public List<Food> selectFoodByName(@Param("name") String name);

    @Select("select * from food where canteen=#{canteen}")
    public List<Food> selectFoodByCanteen(@Param("canteen") String canteen);
}
