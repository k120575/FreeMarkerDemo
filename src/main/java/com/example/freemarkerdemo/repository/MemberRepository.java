package com.example.freemarkerdemo.repository;

import com.example.freemarkerdemo.pojo.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    Member findByName(String name);
}
