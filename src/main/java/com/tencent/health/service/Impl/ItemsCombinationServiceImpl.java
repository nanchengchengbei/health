package com.tencent.health.service.Impl;

import com.tencent.health.dao.ItemsCombinationMapper;
import com.tencent.health.domain.ItemsCombination;
import com.tencent.health.service.ItemsCombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsCombinationServiceImpl implements ItemsCombinationService {

    @Autowired
    private ItemsCombinationMapper itemsCombinationMapper;

    /**
     * 对全体组合进行查询
     * */
    @Override
    public List<ItemsCombination> getItemsCombination() {
        return itemsCombinationMapper.getItemsCombination();
    }
    /**
     * 根据code查询单个组合
     * */

    @Override
    public ItemsCombination getItemsCombinationByCode(Integer code) {
        return itemsCombinationMapper.getItemsCombinationByCode(code);
    }
    /**
     * 新建组合，保存到数据库中
     * */
    @Override
    public Integer insertItemsCombination(ItemsCombination itemsCombination) {
        return itemsCombinationMapper.insertItemsCombination(itemsCombination);
    }
    /**
     * 根据code对组合进行删除
     * */
    @Override
    public Integer deleteItemsCombinationByCode(Integer code) {
        return itemsCombinationMapper.deleteItemsCombinationByCode(code);
    }
    /**
     * 对组合进行修改
     * */
    @Override
    public Integer updateItemsCombination(ItemsCombination itemsCombination) {
        return itemsCombinationMapper.updateItemsCombination(itemsCombination);
    }
}
