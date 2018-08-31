package com.example.service;

import com.zjq.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    @Autowired
    UserDao userDao;


    @GetMapping("/hello")
    public  String  testService(@RequestParam(name="name") String name){
       System.out.println(userDao.findUser().toString());
        return "hello:service "+name;
    }
}
