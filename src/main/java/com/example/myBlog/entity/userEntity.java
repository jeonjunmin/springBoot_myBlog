package com.example.myBlog.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class userEntity {

    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;  //시퀀스

    @Column(nullable = false , length = 30)
    private String username; //아이디

    @Column(nullable = false , length = 100)
    private String password;

    @Column(nullable = false , length = 50)
    private String email;

    @ColumnDefault("user")
    private String role;     //Enum  -- admin,user,manager

    @CreationTimestamp
    private Timestamp createDate;


}
