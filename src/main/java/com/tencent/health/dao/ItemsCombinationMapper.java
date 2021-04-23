package com.tencent.health.dao;

import com.tencent.health.domain.ItemsCombination;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemsCombinationMapper {
    public List<ItemsCombination> getItemsCombination();
    public ItemsCombination getItemsCombinationByCode(Integer code);
    public Integer insertItemsCombination(ItemsCombination itemsCombination);
    public Integer deleteItemsCombinationByCode(Integer code);
    public Integer updateItemsCombination(ItemsCombination itemsCombination);
}
