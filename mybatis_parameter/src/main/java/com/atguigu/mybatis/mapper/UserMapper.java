package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    User getUserByUsername(String username);

    User checkLogin(String username,String password);

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);

    User getUserById(@Param("id") Integer id);

    List<User> getAllUser();

    Integer getCount();

    Map<String,Object> getUserByIdToMap(Integer id);

    List<Map<String,Object>> getAllUserToMap();
}
