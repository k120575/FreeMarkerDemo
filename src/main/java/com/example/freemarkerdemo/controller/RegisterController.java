package com.example.freemarkerdemo.controller;

import com.example.freemarkerdemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RegisterController {

    @Autowired
    MemberService memberService;

    @PostMapping(value = "/addMember")
    public String addMember(HttpServletRequest request, HttpServletResponse response, String name, String password, Integer level){
        memberService.addMember(name, password, level);
        return "redirect:/login";
    }

}
