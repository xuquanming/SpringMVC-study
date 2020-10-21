package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;


@Controller
public class Encoding {

    @RequestMapping("/tt")
    public String test(Model model, String name, HttpServletRequest req) throws UnsupportedEncodingException {
        req.setCharacterEncoding("utf-8");
        model.addAttribute("msg",name);
        return "test";
    }
}
