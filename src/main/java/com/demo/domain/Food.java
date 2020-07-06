package com.demo.domain;

import java.io.Serializable;

/**
 * 食品实体类
 */
public class Food implements Serializable {
    //食品id
    private int id;
    //菜名
    private String name;
    //菜品
    private String type;
    //价格
    private String pay;
    //所属食堂
    private String canteen;

    public Food() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getCanteen() {
        return canteen;
    }

    public void setCanteen(String canteen) {
        this.canteen = canteen;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pay='" + pay + '\'' +
                ", canteen='" + canteen + '\'' +
                '}';
    }
}
