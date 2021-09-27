package com.example.freemarkerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){

        return "index";
    }

    @RequestMapping("/register")
    public String register(){

        return "register";
    }
}
