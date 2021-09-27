package com.example.freemarkerdemo.controller;

import com.example.freemarkerdemo.pojo.Member;
import com.example.freemarkerdemo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;
import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    MemberRepository memberRepository;

    @PostMapping("/login")
    public String login(String name, String password){
        Member member = memberRepository.findByNameAndPassword(name, password);
        if (Objects.nonNull(member)){
            return "redirect:/index";
        } else {
            return null;
        }
    }
}
