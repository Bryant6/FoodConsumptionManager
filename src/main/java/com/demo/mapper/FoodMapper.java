package com.demo.mapper;

import com.demo.domain.Food;
import com.demo.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface FoodMapper {

    @Select("select * from food")
    public List<Food> selectAllFood();

    @Delete("delete from food where id =#{id}")
    public void deleteFood(int id);

    @Select("select * from food where id =#{id}")
    Food selectFoodById(@Param("id") int id);

    @Update("update food set name=#{name},type=#{type},pay=#{pay},canteen=#{canteen} where id=#{id}")
    public void updateFood(@Param("name") String name,@Param("type") String type,@Param("pay") String pay,@Param("canteen") String canteen,@Param("id") int id);

    @Insert("insert into food (name,type,pay,canteen) values(#{name},#{type},#{pay},#{canteen})")
    public void addFood(@Param("name") String name,@Param("type") String type,@Param("pay") String pay,@Param("canteen") String canteen);
}
