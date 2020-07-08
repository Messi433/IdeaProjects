package com.example.dao;

import com.example.domain.Account;

import java.util.List;

public interface IAccountDao {
    /**
     * 查询所有账户，同时包含对应id的用户信息
     * @return
     */
    public List<Account> findAll();

    /**
     * 根据用户id查询对应账户集
     * @param id
     * @return
     */
    public List<Account> findAccountByUid(Integer id);
}
