package com.example.freemarkerdemo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public interface MemberService {

    ModelAndView addMember(String name, String password, Integer level);
}
