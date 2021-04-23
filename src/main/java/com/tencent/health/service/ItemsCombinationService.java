package com.tencent.health.service;

import com.tencent.health.domain.ItemsCombination;

import java.util.List;

public interface ItemsCombinationService {
    public List<ItemsCombination> getItemsCombination();
    public ItemsCombination getItemsCombinationByCode(Integer code);
    public Integer insertItemsCombination(ItemsCombination itemsCombination);
    public Integer deleteItemsCombinationByCode(Integer code);
    public Integer updateItemsCombination(ItemsCombination itemsCombination);
}
