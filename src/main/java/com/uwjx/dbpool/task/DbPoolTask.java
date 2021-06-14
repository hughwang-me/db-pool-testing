package com.uwjx.dbpool.task;

import com.uwjx.dbpool.entity.DbPool;
import com.uwjx.dbpool.service.DbPoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@Slf4j
@EnableAsync
public class DbPoolTask {

    @Autowired
    DbPoolService dbPoolService;

    @Async
    @Scheduled(fixedRate =  200)
    public void run(){
        log.warn("执行测试");
        for (int i = 0; i < 2; i++) {
            DbPool dbPool = new DbPool();
            dbPool.setName("测试名称:" + i);
            dbPoolService.insertSelective(dbPool);
        }
    }

    @Async
    @Scheduled(fixedRate = 100)
    public void query1(){
        log.warn("执行 query1 测试");
        List<DbPool> dbPools = dbPoolService.query();
        int size = dbPools.size();
        Random random = new Random();
        int index = random.nextInt(size);
        dbPoolService.deleteByPrimaryKey(index);
    }

    @Async
    @Scheduled(fixedRate = 100)
    public void query2(){
        log.warn("执行 query2 测试");
        List<DbPool> dbPools = dbPoolService.query();
        int size = dbPools.size();
        Random random = new Random();
        int index = random.nextInt(size);
        dbPoolService.deleteByPrimaryKey(index);
    }

    @Async
    @Scheduled(fixedRate = 100)
    public void query3(){
        log.warn("执行 query3 测试 : ");
        List<DbPool> dbPools = dbPoolService.query();
        int size = dbPools.size();
        Random random = new Random();
        int index = random.nextInt(size);
        dbPoolService.deleteByPrimaryKey(index);
    }
}
