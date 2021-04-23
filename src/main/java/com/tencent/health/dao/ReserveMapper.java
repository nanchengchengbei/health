package com.tencent.health.dao;


import com.tencent.health.domain.Reserve;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReserveMapper {
    /**
     * 查询预约列表
     * */
    public List<Reserve> getReserves();
    /**
     *新增预约，
     *返回受到影响的行数
     * */
    public Integer insertReserve(Reserve reserve);
    /**
     * 按姓名查询
     * */
    public Reserve selectByName(String name);
    /**
     * 按档案号查询
     * */
    public Reserve selectById(Integer id);
    /**
     * 按手机号进行查询
     * */
    public Reserve selectByTelephone(String telephone);
}
