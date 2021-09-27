package com.example.freemarkerdemo.controller;

import com.example.freemarkerdemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Controller
public class RegisterController {

    @Autowired
    MemberService memberService;

    Logger logger = Logger.getLogger("RegisterController");

    @GetMapping("/register")
    public String register(){

        return "register";
    }

    @PostMapping(value = "/addMember")
    public String addMember(String name, String password, Integer level){
        memberService.addMember(name, password, level);
        return "redirect:/login";
    }

}
