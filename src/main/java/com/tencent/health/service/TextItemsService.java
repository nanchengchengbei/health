package com.tencent.health.service;

import com.tencent.health.domain.TextItems;

import java.util.List;

/**
 * 提供检测项的服务
 * */
public interface TextItemsService {
    /**
     * 查询全体检测项
     * */
    public List<TextItems> getTextItems();
    /**
     * 查询通过项目编码
     **/
    public TextItems selectTextItemsByCode(Integer code);
    /**
     * 新增检测项
     * */
    public Integer insertTextItems(TextItems textItems);
    /**
     * 对检测项根据code进行删除
     * */
    public Integer deleteTextItems(Integer coed);
    /**
     * 对检测项根据code进行修改
     * */
    public Integer updateTextItems(TextItems textItems);
}
