package com.jt.sys.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface daoDemo {

    @Select("select count(*) from sys_users")
    int finnews();

}
