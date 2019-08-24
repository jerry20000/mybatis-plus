package com.dao;

import cn.sisyphe.logistics.yh.domain.tj.entity.PreTj;

public interface PreTjMapper {
    int deleteByPrimaryKey(String tjId);

    int insert(PreTj record);

    int insertSelective(PreTj record);

    PreTj selectByPrimaryKey(String tjId);

    int updateByPrimaryKeySelective(PreTj record);

    int updateByPrimaryKey(PreTj record);
}