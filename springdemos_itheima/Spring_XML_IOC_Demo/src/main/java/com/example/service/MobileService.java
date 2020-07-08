package com.example.service;

import com.example.entity.Mobile;

import java.util.List;

/**
 * Spring学习测试
 */
public interface MobileService {
    public Mobile get(int id);
    public List<Mobile> getAll();
}
