package com.tencent.health.dao;

import com.tencent.health.domain.Calendar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CalendarMapper {
    /**
     * 新增日历设置
     * */
    public Integer insertCalendar(Calendar calendar);
    /**
     * 修改日历设置
     * */
    public Integer updateCalendar(Calendar calendar);
    /**
     * 查询全体日历设置
     * */
    public List<Calendar> selectCalender();
}
