package com.demo.domain;

import java.io.Serializable;

/**
 * 食堂实体类
 */
public class Canteen implements Serializable {
    //食堂id
    private int id;
    //名称
    private String name;
    //销售额
    private String daySales;
    //员工数
    private String workerNumber;
    //基本信息
    private String info;
    //用餐时间
    private String openTime;

    public Canteen() {
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

    public String getDaySales() {
        return daySales;
    }

    public void setDaySales(String daySales) {
        this.daySales = daySales;
    }

    public String getWorkerNumber() {
        return workerNumber;
    }

    public void setWorkerNumber(String workerNumber) {
        this.workerNumber = workerNumber;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    @Override
    public String toString() {
        return "Canteen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", daySales='" + daySales + '\'' +
                ", workerNumber='" + workerNumber + '\'' +
                ", info='" + info + '\'' +
                ", openTime='" + openTime + '\'' +
                '}';
    }
}
