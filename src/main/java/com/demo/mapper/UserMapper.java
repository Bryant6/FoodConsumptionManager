package com.demo.mapper;

import com.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select(value = "select * from user")
    public List<User> findAll();

    @Insert(value = "insert into user(username,password,isManager) values(#{username},#{password},#{isManager})")
    void save(User user);

    @Insert(value = "insert into user(username,password,isManager) values(#{username},#{password},#{isManager})")
    public void insertUsernameAndPassword(User user);

    @Select(value = "select * from user where username = #{username} and password = #{password}")
    public User selectUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
