package com.chenbo.demo1.dao;

import com.chenbo.demo1.entity.PocOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("PocOrderMapper")
public interface PocOrderMapper {
    boolean order(PocOrder value);
}
