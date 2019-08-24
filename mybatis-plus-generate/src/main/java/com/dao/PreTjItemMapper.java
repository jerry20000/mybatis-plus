package com.dao;

import cn.sisyphe.logistics.yh.domain.tj.entity.PreTjItem;
import cn.sisyphe.logistics.yh.domain.tj.entity.PreTjItemKey;

public interface PreTjItemMapper {
    int deleteByPrimaryKey(PreTjItemKey key);

    int insert(PreTjItem record);

    int insertSelective(PreTjItem record);

    PreTjItem selectByPrimaryKey(PreTjItemKey key);

    int updateByPrimaryKeySelective(PreTjItem record);

    int updateByPrimaryKey(PreTjItem record);
}