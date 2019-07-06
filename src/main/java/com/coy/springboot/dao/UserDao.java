package com.coy.springboot.dao;

import com.coy.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDao {

    @Select("SELECT id,username,age,phone,`desc` FROM user WHERE age=#{age}")
    @Results(value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property="email",column="desc"),
    })
    public List<User> getUser(int age) ;
}
