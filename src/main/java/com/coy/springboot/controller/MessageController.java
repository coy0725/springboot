package com.coy.springboot.controller;

import com.coy.springboot.pojo.User;
import com.coy.springboot.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = {"/index"})
public class MessageController {
    @Autowired
    UserService userService;

   @GetMapping("/show")
    public List<User> getUser(int age) {
        return userService.getUser(age);
    }

    @ResponseBody
    @GetMapping("")
    public Map<String,String> returnMessage(){
        Map<String, String> map = new HashMap<>();
        map.put("liming", "he is a clever boy");
        map.put("tom", "she is a ennerer");
        return map;
    }
    @GetMapping("/noResponseBody")
    public Map<String,String> returnMessage2(){
        Map<String, String> map = new HashMap<>();
        map.put("liming", "he is a clever boy");
        map.put("tom", "she is a ennerer");
        return map;
    }

}
