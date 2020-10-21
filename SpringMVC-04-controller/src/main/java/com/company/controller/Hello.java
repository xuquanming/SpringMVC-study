package com.company.controller;

import com.company.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Hello {


    @RequestMapping("/hello")
    public String hello(User user){
        System.out.println(user);
        return "hello";
    }
}
