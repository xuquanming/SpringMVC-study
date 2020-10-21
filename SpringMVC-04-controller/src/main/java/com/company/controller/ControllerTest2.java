package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {

    //映射访问路径
    @RequestMapping("/t2")
    public String test(Model model){

        //SpringMVC会自动实例化一个model对象用于向视图中传值
        model.addAttribute("msg","Spring Annotation");
        return "test";//返回视图位置
    }
}
