package com.example.freemarkerdemo.pojo;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自動增長主鍵
    private Integer id;

    @Column
    public String name;

    @Column
    public String password;

    @Column(nullable = false)
    public Integer level;

    @Column
    public BigDecimal score;

    @Column(name = "create_user")
    public String createUser;

    @Column(name = "create_time")
    public LocalDateTime createTime;

    public Member(){}

    public Member(String name, String password, Integer level){
        this.name = name;
        this.password = password;
        this.level = level;
    }
}
