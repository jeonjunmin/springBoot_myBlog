package com.example.myBlog.controller;

import com.example.myBlog.dao.userDao;
import com.example.myBlog.entity.userEntity;
import com.example.myBlog.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class userController {

    @Autowired //스프링부트가 미리 생성해 놓은 객체를 가져다가 자동연결
    private userRepository userRpstr;

    @GetMapping("/user/joinForm")
    public String joinForm(){

        return "user/joinForm";
    }

    @PostMapping("/user/create")
    public String userCreate(userDao userform){
        System.out.println("User Dao Info ---> "+userform.toString());

        //1. Dao를 Entity로 변환
        userEntity userET = userform.toEntity();
        System.out.println("User Entity Info ---> "+userET.toString());

        userRpstr.save(userET);

        return "user/joinForm";
    }
}
