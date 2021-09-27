package com.example.freemarkerdemo.service.impl;

import com.example.freemarkerdemo.pojo.Member;
import com.example.freemarkerdemo.repository.MemberRepository;
import com.example.freemarkerdemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.logging.Logger;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    Logger logger = Logger.getLogger("MemberServiceImpl");

    @Override
    public String addMember(String name, String password, Integer level) {
        Member member = memberRepository.findByName(name);
        if (Objects.isNull(member)){
            Member member1 = new Member(name, password, level);
            member1.setCreateTime(LocalDateTime.now());
            memberRepository.saveAndFlush(member1);
            logger.info("Add SUCCESS");
            return "redirect:/login";
        } else {
            logger.info("Already Exist");
            return "redirect:/login";
        }
    }
}
