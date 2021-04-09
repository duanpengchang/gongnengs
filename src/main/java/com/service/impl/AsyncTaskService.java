package com.service.impl;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {


 @Async  //这是一个异步方法
 public void Hello() throws InterruptedException {

  Thread.sleep(3000);

  System.out.println("nihao");

 }

 }
