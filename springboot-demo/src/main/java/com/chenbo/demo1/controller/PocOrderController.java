package com.chenbo.demo1.controller;

import com.chenbo.demo1.dao.PocOrderMapper;
import com.chenbo.demo1.entity.PocOrder;
import com.chenbo.demo1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName PocOrderController
 * @Description TODO
 * @Author chenbo
 * @Date 2019-05-13 16:48
 **/
@RestController
public class PocOrderController {
    @Autowired
    PocOrderMapper pocOrderMapper;




    //http://localhost:8888/addPocOrder?username=xiaoli2&password=123
    @RequestMapping("/addPocOrder")
    public String addUser(){
        PocOrder pocOrder = new PocOrder();
        pocOrder.setFee("90");
        pocOrder.setUserid("100001");
        pocOrder.setProductid("20001");
        pocOrderMapper.order(pocOrder);
        return "success!";
    }


}
