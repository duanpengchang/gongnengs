package com.controller;


import com.entity.User;
import com.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@CrossOrigin
@Api(value = "ceshi")
@RequestMapping("user")
public class UserController {

 @Resource
 private UserService userService;





 // 测试mybatis
 @GetMapping("/selectuser")
 public Object findByLoginname() {
  Logger logger = LoggerFactory.getLogger(UserController.class);


  String name = "共产党是";
  User user = userService.selectUserName(name);

  System.out.println("张三是王八猫");

  logger.info("登录成功");


  return user;

 }

 // 测试mybatisPlus
 @GetMapping("/selectuservv")
 public Object findAllName() {
  Logger logger = LoggerFactory.getLogger(UserController.class);
  Integer id=10;

  User user = userService.selectAllUser(id);


  return user;

 }


//测试jpa
 @GetMapping("/addusers")
 @ApiOperation(value = "添加User", notes = "添加User", httpMethod = "GET")
 public Object addUser(@ApiParam User  user) {

  userService.addUser(user);


  return user;




 }

}
