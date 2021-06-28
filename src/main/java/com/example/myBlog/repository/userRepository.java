package com.example.myBlog.repository;

import com.example.myBlog.entity.userEntity;
import org.springframework.data.repository.CrudRepository;

public interface  userRepository extends CrudRepository<userEntity, Long> {

}
