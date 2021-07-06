package com.example.myBlog.repository;

import com.example.myBlog.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface  userRepository extends JpaRepository<userEntity, Integer> {

}
