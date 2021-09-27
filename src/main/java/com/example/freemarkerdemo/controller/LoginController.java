package com.example.freemarkerdemo.controller;

import com.example.freemarkerdemo.pojo.Member;
import com.example.freemarkerdemo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

@Controller
public class LoginController {

    @Autowired
    MemberRepository memberRepository;

    Logger logger = Logger.getLogger("LoginController");

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String name, String password){
        Member member = memberRepository.findByNameAndPassword(name, password);
        if (Objects.nonNull(member)){
            logger.info("Login SUCCESS");
            return "redirect:/index";
        } else {
            logger.info("Login FALSE");
            return null;
        }
    }
}
