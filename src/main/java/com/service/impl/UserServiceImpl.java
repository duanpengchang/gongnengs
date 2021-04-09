package com.service.impl;

import com.dao.JpaDao;
import com.dao.MybatisDao;
import com.dao.MybatisPluseDao;
import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {



 @Resource
 private MybatisDao mybatisDao;

 @Resource
 private MybatisPluseDao mybatisPluseDao;

 @Resource
 private JpaDao jpaDao;



 @Override
 public User selectUserName(String name) {

  return mybatisDao.selectUserByName(name);
 }

 @Override
 public User selectAllUser(Integer id) {
  return mybatisPluseDao.selectById(id);
 }

 @Override
 public void addUser(User user) {

  jpaDao.save(user);
 }

}
