package com.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 全局定时任务就
 * @author   dpc
 * @param
 */
@Component
public class ScheduledDemo {

 Logger logger = LoggerFactory.getLogger(ScheduledDemo.class);

 Date date=new Date();

 SimpleDateFormat ss=new SimpleDateFormat("yyyyMMdd");

/*
@Scheduled(fixedRate = 5000)//每隔5秒执行
 public void reportCurrentTime(){


  logger.info("我将来是大牛");
 }*/

}
