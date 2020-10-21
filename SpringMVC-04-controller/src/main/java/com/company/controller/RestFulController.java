package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RestFulController {


    /*@RequestMapping(value ="/add/{a}/{b}",method = RequestMethod.POST)*/
    @GetMapping("/add/{a}/{b}")
    public String test(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","结果为："+res);


        return "test";
    }
}
