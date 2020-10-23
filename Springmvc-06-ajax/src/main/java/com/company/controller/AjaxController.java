package com.company.controller;


import com.company.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {


    @RequestMapping("/test")
    public String test(){
        return "ss";
    }



    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a:param==>"+name);
        if("ming".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> list = new ArrayList<>();

        //添加数据
        list.add(new User("ming",4,"nan"));
        list.add(new User("r",4,"女"));
        return list;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg="";
        if(name!=null){
            if ("admin".equals(name)) {
                msg="ok";
            }else{
                msg="false";
            }
            }

        if(pwd!=null){
            if ("123456".equals(pwd)) {
                msg="ok";
            }else{
                msg="false";
            }
        }
        return msg;
    }
}
