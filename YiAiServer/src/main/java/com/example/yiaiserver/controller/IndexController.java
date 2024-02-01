package com.example.yiaiserver.controller;

import entity.UserHealth;
import entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public UserInfo hello(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserAddress("绵阳");
        userInfo.setUserName("xsl");
        userInfo.setUserPhone("xxxx");
        UserHealth userHealth = new UserHealth();
        userHealth.setAge(29);
        userHealth.setHeight(100);
        userHealth.setWidth(50);
        userHealth.setSight(5);
        userInfo.setUserHealth(userHealth);
        return userInfo;
    }
}
