package com.tencent.health.domain;

/**
 * 作为检测项的组合的实体类
 * */
public class ItemsCombination {
    private Integer code;
    private String name;
    private String easyName;
    private String gender;
    private String ageDown;
    private String ageUp;
    private String value;
    private String cost;
    private String explain;
    private String attention;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEasyName() {
        return easyName;
    }

    public void setEasyName(String easyName) {
        this.easyName = easyName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeDown() {
        return ageDown;
    }

    public void setAgeDown(String ageDown) {
        this.ageDown = ageDown;
    }

    public String getAgeUp() {
        return ageUp;
    }

    public void setAgeUp(String ageUp) {
        this.ageUp = ageUp;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }
}
