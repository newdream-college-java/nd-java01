package com.cc.mapper;

import java.util.List;

import com.cc.entity.User;

public interface UserMapper {
    List<User> findAll();
    int updateAuthor(User user);
    int adduser(User user);
    int dropuser(int user);
}

