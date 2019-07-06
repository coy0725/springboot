package com.coy.springboot.service;

import com.coy.springboot.dao.UserDao;
import com.coy.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public List<User> getUser(int age) {
        return userDao.getUser(age);
    }

}
