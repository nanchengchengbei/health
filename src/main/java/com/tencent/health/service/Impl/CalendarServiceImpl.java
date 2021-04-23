package com.tencent.health.service.Impl;

import com.tencent.health.dao.CalendarMapper;
import com.tencent.health.domain.Calendar;
import com.tencent.health.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {

    @Autowired
    private CalendarMapper calendarMapper;

    /**
     * 对日历预约进行判断，没有的进行新增，对以存在的进行修改
     * */
    @Override
    public Integer judge(Calendar calendar) {
        String date = calendar.getDate();
        List<Calendar> list = calendarMapper.selectCalender();
        for (Calendar c:list){
            if (date.equals(c.getDate())){
                return calendarMapper.updateCalendar(calendar);
            }
        }
        return calendarMapper.insertCalendar(calendar);
    }


    @Override
    public Integer insertCalendar(Calendar calendar) {
        return calendarMapper.insertCalendar(calendar);
    }

    @Override
    public Integer updateCalendar(Calendar calendar) {
        return calendarMapper.updateCalendar(calendar);
    }


}
