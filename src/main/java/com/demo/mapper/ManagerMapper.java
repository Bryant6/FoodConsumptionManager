package com.demo.mapper;

import com.demo.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ManagerMapper {

    @Select("select * from user")
    public List<User> selectAllUser();

    @Delete("delete from user where id =#{id}")
    void DeleteUser(int id);

    @Select("select * from user where id =#{id}")
    User selectUserById(int id);

    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    public void updateUser(@Param("username") String username, @Param("password") String password, @Param("id") int id);
}
