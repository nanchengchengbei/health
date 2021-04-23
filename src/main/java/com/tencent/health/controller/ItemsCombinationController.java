package com.tencent.health.controller;


import com.tencent.health.domain.ItemsCombination;
import com.tencent.health.service.ItemsCombinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemsCombinationController {
    @Autowired
    private ItemsCombinationService itemsCombinationService;

    @RequestMapping("getItemsCombination")
    public List<ItemsCombination> getItemsCombination(){
        return itemsCombinationService.getItemsCombination();
    }
    @RequestMapping("getItemsCombinationByCode")
    public ItemsCombination getItemsCombinationByCode(Integer code){
        return itemsCombinationService.getItemsCombinationByCode(code);
    }
    @RequestMapping("insertItemsCombination")
    public Integer insertItemsCombination(ItemsCombination itemsCombination){
        return itemsCombinationService.insertItemsCombination(itemsCombination);
    }
    @RequestMapping("deleteItemsCombinationByCode")
    public Integer deleteItemsCombinationByCode(Integer code){
        return itemsCombinationService.deleteItemsCombinationByCode(code);
    }
    @RequestMapping("updateItemsCombination")
    public Integer updateItemsCombination(ItemsCombination itemsCombination){
        return itemsCombinationService.updateItemsCombination(itemsCombination);
    }
}
