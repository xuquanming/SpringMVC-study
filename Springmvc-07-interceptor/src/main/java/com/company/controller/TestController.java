package com.company.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/tt")
    public String test(){
        System.out.println("TestController==>"+"执行了");
        return "ok";
    }
}
