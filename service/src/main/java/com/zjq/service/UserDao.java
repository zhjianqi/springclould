package com.zjq.service;

import com.zjq.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Mapper
public interface UserDao {
     User addUser(@Param("User") User user);
     User findUser();
}
