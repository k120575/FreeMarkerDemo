package com.example.freemarkerdemo.service;

import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    void addMember(String name, String password, Integer level);
}
