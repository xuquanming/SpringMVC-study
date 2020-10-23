package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpSession session,String username, String pwd){

        //把用户信息存在session中
        session.setAttribute("userLoginInfo",username);
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin(HttpSession session,String username, String pwd){


        return "login";
    }

    @RequestMapping("/main")
    public String main(HttpSession session,String username, String pwd){


        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session,String username, String pwd){

        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
