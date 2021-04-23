package com.tencent.health.service.Impl;

import com.tencent.health.dao.ReserveMapper;
import com.tencent.health.domain.Reserve;
import com.tencent.health.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReserveServiceImpl implements ReserveService {

    @Autowired
    private ReserveMapper reserveMapper;

    @Override
    public List<Reserve> getReserves() {
        return reserveMapper.getReserves();
    }

    @Override
    public Integer insertReserve(Reserve reserve) {
        return reserveMapper.insertReserve(reserve);
    }

    @Override
    public Reserve judgeReserve(String string) {
        Reserve reserve = null;
        if (string.matches("[0-9]+")){      //判断是否为数字
            reserve = reserveMapper.selectById(Integer.valueOf(string));
            if (reserve==null){                     //查询id查不到的话，查电话号
                reserve=reserveMapper.selectByTelephone(string);
            }
        }else {
            reserve=reserveMapper.selectByName(string);     //不是数字的话查姓名
        }
        return reserve;
    }


}
