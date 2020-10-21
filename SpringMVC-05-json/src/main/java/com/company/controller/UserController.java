package com.company.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.company.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {


    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {


        //jackson    ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("ming",3,"男");


        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {


        List<User> list = new ArrayList<>();
        //jackson    ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("ming",3,"男");
        User user1 = new User("ming",3,"男");
        User user2 = new User("ming",3,"男");
        User user3 = new User("ming",3,"男");
        User user4 = new User("ming",3,"男");
        User user5 = new User("ming",3,"男");

        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        String s = mapper.writeValueAsString(list);
        return s;
    }


    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {


        List<User> list = new ArrayList<>();
        //创建一个对象
        User user = new User("ming",3,"男");
        User user1 = new User("ming",3,"男");
        User user2 = new User("ming",3,"男");
        User user3 = new User("ming",3,"男");
        User user4 = new User("ming",3,"男");
        User user5 = new User("ming",3,"男");

        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        System.out.println("*******Java对象转JSON字符串******");
        String str1 = JSON.toJSONString(list);
        System.out.println("JSON.toJSONString(list)==>"+str1);
        String str2 = JSON.toJSONString(user);
        System.out.println("JSON.toJSONString(user)==>"+str2);

        System.out.println("*******Json字符串转Java对象******");
        User juser = JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+juser);
        JSONObject job = (JSONObject) JSON.toJSON(user);
        System.out.println("(JSONObject) JSON.toJSON(user)==>"+job);

        return "f";
    }
}
