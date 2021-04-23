package com.tencent.health.service;

import com.tencent.health.domain.Calendar;

public interface CalendarService {
    /**
     * 实验新增日历设置
     * */
    public Integer insertCalendar(Calendar calendar);
    /**
     * 修改日历设置
     * */
    public Integer updateCalendar(Calendar calendar);
    /**
     * 判断其本事是否存在，若存在则修改其数值，若不存在则新增日历设置
     * */
    public Integer judge(Calendar calendar);
}
