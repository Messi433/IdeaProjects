package com.example.dao;

import com.example.domain.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    @Select("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

    @Update("update user set name=#{name},money=#{money} where id =#{id}")
    public void updateAccount(Account account);

    @Results(id = "accountMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "money", property = "money"),
    })
    @Select("select * from account")
    public List<Account> findAll();

    @Select("select * from account where id =#{id}")
    @ResultMap("accountMap")
    public Account findById(Integer id);
}
