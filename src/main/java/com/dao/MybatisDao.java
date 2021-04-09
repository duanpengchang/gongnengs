package com.dao;

import com.entity.User;

/*@Mapper*/
public interface MybatisDao {


 User selectUserByName(String name);
}
