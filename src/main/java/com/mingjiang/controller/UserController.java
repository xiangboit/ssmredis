package com.mingjiang.controller;

import com.mingjiang.bean.User;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import  com.mingjiang.service.UserService;
import javax.annotation.Resource;


/**
 * Created by Administrator on 2016/12/28.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService users;
    @RequestMapping("/showuser")
    public  void  getUserAll(){
        System.out.println(12312312);
        User user;
//        user = users.getById(1l);
        System.out.println(12312312);
    }
}
