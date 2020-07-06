package com.demo.mapper;

import com.demo.domain.Food;
import com.demo.domain.Canteen;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CanteenMapper {

    @Select("select * from canteen")
    public List<Canteen> selectAllCanteen();

    @Select("select * from food where canteen=#{canteen}")
    public List<Food> findFood(@Param("canteen") String canteen);

    @Select("select * from canteen where id=#{id}")
    public Canteen findCanteen(@Param("id") int id);

    @Update("update canteen set name=#{name},workerNumber=#{workerNumber},info=#{info},openTime=#{openTime} where id=#{id}")
    public void updateCanteen(@Param("name") String name, @Param("workerNumber") String workerNumber,@Param("info") String info,@Param("openTime") String openTime, @Param("id") int id);
}
