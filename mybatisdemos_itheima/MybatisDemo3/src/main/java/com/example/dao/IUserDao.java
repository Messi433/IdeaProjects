package com.example.dao;

import com.example.domain.User;

import java.util.List;

public interface IUserDao {
    public List<User> findAll();
}
