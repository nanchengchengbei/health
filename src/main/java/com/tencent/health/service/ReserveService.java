package com.tencent.health.service;

import com.tencent.health.domain.Reserve;

import java.util.List;

public interface ReserveService {
    /**
     *查询预约列表的信息，提供数据支持，
     * 使用mybatis的内容，访问数据库
     * */
    public List<Reserve> getReserves();
    /**
     *新增预约
     * */
    public Integer insertReserve(Reserve reserve);
    /**
     * 判断并查询
     * */
    public Reserve judgeReserve(String string);
}
