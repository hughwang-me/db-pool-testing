package com.uwjx.dbpool.mapper;

import com.uwjx.dbpool.entity.DbPool;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DbPoolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DbPool record);

    int insertSelective(DbPool record);

    List<DbPool> query();

    int updateByPrimaryKeySelective(DbPool record);

    int updateByPrimaryKey(DbPool record);
}
