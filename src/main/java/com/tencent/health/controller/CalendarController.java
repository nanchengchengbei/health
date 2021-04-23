package com.tencent.health.controller;

import com.tencent.health.domain.Calendar;
import com.tencent.health.service.CalendarService;
import com.tencent.health.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {
    @Autowired
    private CalendarService calendarService;

    @RequestMapping("insertCalendar")
    public Integer insertCalendar(Calendar calendar){
        return calendarService.insertCalendar(calendar);
    }

    @RequestMapping("updateCalendar")
    public Integer updateCalendar(Calendar calendar){
        return calendarService.updateCalendar(calendar);
    }

    @RequestMapping("judge")
    public Integer judgeExistence(Calendar calendar){
        return calendarService.judge(calendar);
    }

}

