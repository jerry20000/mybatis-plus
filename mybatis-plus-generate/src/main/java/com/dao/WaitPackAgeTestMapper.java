package com.dao;

import com.pojo.WaitPackAgeTest;

public interface WaitPackAgeTestMapper {
    int deleteByPrimaryKey(String id);

    int insert(WaitPackAgeTest record);

    int insertSelective(WaitPackAgeTest record);

    WaitPackAgeTest selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(WaitPackAgeTest record);

    int updateByPrimaryKey(WaitPackAgeTest record);
}