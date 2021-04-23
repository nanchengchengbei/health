package com.tencent.health.service.Impl;

import com.tencent.health.dao.RelationMapper;
import com.tencent.health.domain.Relation;
import com.tencent.health.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationServiceImpl implements RelationService {

    @Autowired
    private RelationMapper relationMapper;

    @Override
    public List<Relation> getRelationByCode(Integer code) {
        return relationMapper.getRelationByCode(code);
    }

    @Override
    public Integer insertRelation(Relation relation) {
        return  relationMapper.insertRelation(relation);
    }

    @Override
    public Integer deleteRelation(Relation relation) {
        return relationMapper.deleteRelation(relation);
    }
}
