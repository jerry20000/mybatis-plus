package com.dao;

import cn.sisyphe.logistics.yh.domain.yh.entity.PreYhItem;
import cn.sisyphe.logistics.yh.domain.yh.entity.PreYhItemKey;

public interface PreYhItemMapper {
    int deleteByPrimaryKey(PreYhItemKey key);

    int insert(PreYhItem record);

    int insertSelective(PreYhItem record);

    PreYhItem selectByPrimaryKey(PreYhItemKey key);

    int updateByPrimaryKeySelective(PreYhItem record);

    int updateByPrimaryKey(PreYhItem record);
}