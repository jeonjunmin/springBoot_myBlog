package com.example.myBlog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class blogController {

    @GetMapping("/test/hello")
    public String hello(){
        return "hello";
    }
}
