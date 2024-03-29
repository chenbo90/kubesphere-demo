package com.chenbo.demo1.controller;

import com.chenbo.demo1.dao.UserMapper;
import com.chenbo.demo1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author chenbo
 * @Date 2019-05-13 16:04
 **/
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    //http://localhost:8888/getUser?username=xiaoli2
    @RequestMapping("/getUser")
    public String getUser(String username){
        User user =userMapper.findUserByUsername(username);
        return user!=null ? username+"的密码是："+user.getUser_password():"不存在用户名为"+username+"的用户";
    }

    @RequestMapping("/testcrd")
    public String testcrd(){

        return null;
    }


    //http://localhost:8888/updateUser?username=xiaoli2&password=123
    @RequestMapping("/updateUser")
    public String updateUser(String password,String username){
        User user = new User(username,password);
        userMapper.updateUserByUsername(user);
        return "success!";
    }


    //http://localhost:8888/addUser?username=xiaoli2&password=123
    @RequestMapping("/addUser")
    public String addUser(String username,String password){
        User user = new User(username,password);
        userMapper.saveUser(user);
        return "success!";
    }

    //http://localhost:8888/addUser?username=xiaoli2
    @RequestMapping("/deleteUser")
    public String deleteUser(String username){
        userMapper.deleteUserByUsername(username);
        return "success!";
    }

    //http://localhost:8888/getUserList
    @RequestMapping("/getUserList")
    public List getUserList(String username, String password){
        return userMapper.getUserList();
    }


    public static void main(String[] args) {
        System.out.println(1 << 32);
    }
}

