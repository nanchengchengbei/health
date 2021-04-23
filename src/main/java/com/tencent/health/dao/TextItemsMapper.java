package com.tencent.health.dao;

import com.tencent.health.domain.TextItems;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TextItemsMapper {

    public List<TextItems> getTextItems();
    public TextItems selectTextItemsByCode(Integer code);
    public Integer insertTextItems(TextItems textItems);
    public Integer deleteTextItems(Integer code);
    public Integer updateTextItems(TextItems textItems);
}
