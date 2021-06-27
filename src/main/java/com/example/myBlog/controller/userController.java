package com.example.myBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {

    @GetMapping("/user/joinForm")
    public String joinForm(){
        return "user/joinForm";
    }

    @PostMapping("/user/create")
    public String userCreate(){
        System.out.println("@@@@@@@@@");
        return "user/joinForm";
    }
}
