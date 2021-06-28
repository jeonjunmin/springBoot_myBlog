package com.example.myBlog.dao;

import com.example.myBlog.entity.userEntity;

public class userDao {

    private String username;
    private String password;
    private String email;

    public userDao(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public userEntity toEntity(){
        userEntity userET = null;

        return new userEntity(username, password,email  );
    }

    @Override
    public String toString() {
        return "userDao{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
