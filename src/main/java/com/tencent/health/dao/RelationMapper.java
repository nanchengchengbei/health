package com.tencent.health.dao;

import com.tencent.health.domain.Relation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RelationMapper {
    /**
     * 返回某一组合的全部检测项
     * */
    public List<Relation> getRelationByCode(Integer code);

    /**
     * 对组合中的检测项，进行新增
     * */
    public Integer insertRelation(Relation relation);

    /**
     * 对组合中的检测项，进行删除
     * */
    public Integer deleteRelation(Relation relation);
}
