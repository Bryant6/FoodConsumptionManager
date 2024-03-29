package com.demo.domain;

import java.io.Serializable;

/**
 * 用户实体类
 */
public class User implements Serializable {
    //用户id
    private Integer id;
    //用户名
    private String username;
    //密码
    private String password;
    //是否是管理员
    private Integer isManager;

    public User() {
    }

    public User(Integer id, String username, String password,Integer isManager) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isManager = isManager;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIsManager() {
        return isManager;
    }

    public void setIsManager(Integer isManager) {
        this.isManager = isManager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
