package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: gs_wang
 * @Date: 2024/07/26/上午10:23
 * @Description: Spring Task 入门案例
 */
@Component // 该类需要实例化，并生成bean交给容器管理
@Slf4j
public class MyTask {

//    @Scheduled(cron = "0/5 * * * * ?")
//    public void executeTask(){
//        log.info("定时任务开始执行：{}",new Date());
//    }

}
