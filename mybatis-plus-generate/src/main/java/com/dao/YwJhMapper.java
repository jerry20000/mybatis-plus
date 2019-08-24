package com.dao;

import com.pojo.YwJh;

public interface YwJhMapper {
    int deleteByPrimaryKey(String jhId);

    int insert(YwJh record);

    int insertSelective(YwJh record);

    YwJh selectByPrimaryKey(String jhId);

    int updateByPrimaryKeySelective(YwJh record);

    int updateByPrimaryKey(YwJh record);
}