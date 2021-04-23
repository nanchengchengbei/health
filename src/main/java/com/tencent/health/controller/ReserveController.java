package com.tencent.health.controller;


import com.tencent.health.dao.ReserveMapper;
import com.tencent.health.domain.Reserve;
import com.tencent.health.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReserveController {

    @Autowired
    private ReserveService reserveService;
    //查看全部的预约列表
    @RequestMapping("reserves")
    public List<Reserve> getReserves(){
        return reserveService.getReserves();
    }
    //新增预约
    @RequestMapping("insert")
    public Integer insertReserve(Reserve reserve){
        return reserveService.insertReserve(reserve);
    }

    @RequestMapping("judgeReserve")
    public Reserve judgeReserve(String string){
        return reserveService.judgeReserve(string);
    }


}
