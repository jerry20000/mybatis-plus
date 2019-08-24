package com.dao;

import cn.sisyphe.logistics.yh.domain.station.entity.StationTotal;

public interface StationTotalMapper {
    int deleteByPrimaryKey(String stationId);

    int insert(StationTotal record);

    int insertSelective(StationTotal record);

    StationTotal selectByPrimaryKey(String stationId);

    int updateByPrimaryKeySelective(StationTotal record);

    int updateByPrimaryKey(StationTotal record);
}