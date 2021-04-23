package com.tencent.health.domain;


/**
 * 作为日历预约的实体类
 * */
public class Calendar {
    private String date;;
    private Integer number;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
