package com.dao;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaDao  extends JpaRepository<User,Integer> {
}
