package com.example.freemarkerdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(Map<String, Object> map){

        return "login";
    }
}
