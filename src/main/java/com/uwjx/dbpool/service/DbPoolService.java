package com.uwjx.dbpool.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.uwjx.dbpool.mapper.DbPoolMapper;
import com.uwjx.dbpool.entity.DbPool;

import java.util.List;

@Service
public class DbPoolService{

    @Resource
    private DbPoolMapper dbPoolMapper;


    public int deleteByPrimaryKey(Integer id) {
        return dbPoolMapper.deleteByPrimaryKey(id);
    }


    public int insert(DbPool record) {
        return dbPoolMapper.insert(record);
    }


    public int insertSelective(DbPool record) {
        return dbPoolMapper.insertSelective(record);
    }


    public List<DbPool> query() {
        return dbPoolMapper.query();
    }


    public int updateByPrimaryKeySelective(DbPool record) {
        return dbPoolMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(DbPool record) {
        return dbPoolMapper.updateByPrimaryKey(record);
    }

}
