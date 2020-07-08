package com.example.dao;

import com.example.domain.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface IAccountDao {
    /**
     * 查询所有账户，同时包含对应id的用户信息
     *
     * @return
     */
    @Results(id = "accountMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "uid", property = "uid"),
            @Result(column = "money", property = "money"),
            //uid作为user表的id，实现UserDao.findById(id)
            @Result(column = "uid", property = "user",
                    //fetchType = FetchType.EAGER：立即加载、fetchType = FetchType.LAZY：懒加载
                    one = @One(select = "com.example.dao.IUserDao.findById", fetchType = FetchType.LAZY))
    })
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 通过uid查询用户的账户信息
     *
     * @return
     */
    @Select("select * from account where uid = #{uid}")
    public Account findByUid(int userId);

    public void deleteUser(int accountId);

}
