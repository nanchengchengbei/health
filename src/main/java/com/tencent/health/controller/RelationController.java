package com.tencent.health.controller;


import com.tencent.health.domain.Relation;
import com.tencent.health.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RelationController {

    @Autowired
    private RelationService relationService;

    @RequestMapping("getRelationByCode")
    public List<Relation> getRelationByCode(Integer code){
        return relationService.getRelationByCode(code);
    }

    @RequestMapping("insertRelation")
    public Integer insertRelation(Relation relation){
        return relationService.insertRelation(relation);
    }
    @RequestMapping("deleteRelation")
    public Integer deleteRelation(Relation relation){
        return relationService.deleteRelation(relation);
    }
}
