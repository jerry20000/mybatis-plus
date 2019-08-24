package com.dao;

import cn.sisyphe.logistics.yh.domain.yh.entity.PreYh;

public interface PreYhMapper {
    int deleteByPrimaryKey(String yhId);

    int insert(PreYh record);

    int insertSelective(PreYh record);

    PreYh selectByPrimaryKey(String yhId);

    int updateByPrimaryKeySelective(PreYh record);

    int updateByPrimaryKey(PreYh record);
}