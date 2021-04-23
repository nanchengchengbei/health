package com.tencent.health.controller;


import com.tencent.health.domain.TextItems;
import com.tencent.health.service.TextItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.type.IntersectionType;
import java.util.List;

@RestController
public class TextItemsController {

    @Autowired
    private TextItemsService textItemsService;

    @RequestMapping("getTextItems")
    public List<TextItems> getTextItems(){
        return textItemsService.getTextItems();
    }

    @RequestMapping("selectTextItemsByCode")
    public TextItems selectTextItemsByCode(Integer code){
        return textItemsService.selectTextItemsByCode(code);
    }

    @RequestMapping("insertTextItems")
    public Integer insertTextItems(TextItems textItems){
        return textItemsService.insertTextItems(textItems);
    }

    @RequestMapping("deleteTextItems")
    public Integer deleteTextItems(Integer code){
        return textItemsService.deleteTextItems(code);
    }

    @RequestMapping("updateTextItems")
    public Integer updateTextItems(TextItems textItems){
        return textItemsService.updateTextItems(textItems);
    }

}
