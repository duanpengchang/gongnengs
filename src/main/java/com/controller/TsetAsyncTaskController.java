package com.controller;


import com.service.impl.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * 异步任务   返回数据同时隔3秒去控制台输出你好
 */
@Controller
@RequestMapping("/ceshi")
public class TsetAsyncTaskController {

 @Autowired
 private AsyncTaskService asyncTaskService;

 @GetMapping("/test")
 @ResponseBody
 public String hello() throws InterruptedException {

  asyncTaskService.Hello();

  return "ok";

 }


}
