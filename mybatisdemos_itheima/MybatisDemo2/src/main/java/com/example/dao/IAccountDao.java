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
     * 查询所有账户，并且包含用户名称和地址信息
     * @return
     */
    public Account findById(int accountId);
    public void deleteUser(int accountId);

}
