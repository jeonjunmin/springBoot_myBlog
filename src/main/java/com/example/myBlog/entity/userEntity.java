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




    @Column(name="createDate")
    private Timestamp createDate;


    public userEntity(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = "user";
        this.createDate = null;
    }

    @Override
    public String toString() {
        return "userEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
