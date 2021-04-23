package com.tencent.health.service;

import com.tencent.health.domain.Relation;


import java.util.List;

public interface RelationService {
    /**
     *
     * 对单个组合查询其全部检测项
     * */
    public List<Relation> getRelationByCode(Integer code);
    /**
     * 对组合中的检测项，进行新增
     * */
    public Integer insertRelation(Relation relation);
    /**
     * 对组合中的检测项进行删除
     * */
    public Integer deleteRelation(Relation relation);
}
