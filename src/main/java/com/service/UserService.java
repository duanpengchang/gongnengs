package com.service;

import com.entity.User;

public interface UserService {


 User selectUserName(String name);


 User selectAllUser(Integer id);

 void addUser(User user);
}
