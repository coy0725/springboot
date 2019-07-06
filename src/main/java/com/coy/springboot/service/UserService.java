package com.coy.springboot.service;

import com.coy.springboot.pojo.User;

import java.util.List;

public interface UserService  {
    public List<User> getUser(int age) ;
}
