package com.tencent.health.service.Impl;

import com.tencent.health.dao.TextItemsMapper;
import com.tencent.health.domain.TextItems;
import com.tencent.health.service.TextItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作为检测项的实现类
 * */
@Service
public class TextItemsServiceImpl implements TextItemsService {

    @Autowired
    private TextItemsMapper textItemsMapper;


    @Override
    public List<TextItems> getTextItems() {
        return textItemsMapper.getTextItems();
    }

    @Override
    public TextItems selectTextItemsByCode(Integer code) {
        return textItemsMapper.selectTextItemsByCode(code);
    }

    @Override
    public Integer insertTextItems(TextItems textItems) {
        return textItemsMapper.insertTextItems(textItems);
    }

    @Override
    public Integer deleteTextItems(Integer code) {
        return textItemsMapper.deleteTextItems(code);
    }

    @Override
    public Integer updateTextItems(TextItems textItems) {
        return textItemsMapper.updateTextItems(textItems);
    }
}
