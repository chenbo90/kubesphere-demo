package com.chenbo.demo1.dao;

import com.chenbo.demo1.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author chenbo
 * @Date 2019-05-13 16:06
 **/
@Mapper
@Component("UserMapper")
public interface UserMapper {
    User findUserByUsername(String username);

    void updateUserByUsername(User user);

    void deleteUserByUsername(String username);

    void saveUser(User user);

    List<User> getUserList();
}

